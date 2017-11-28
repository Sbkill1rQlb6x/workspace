package action;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import entity.Student;
import service.StudentService;

@Controller
public class StudentAction {
	@Autowired
	private StudentService studentService;

	public StudentService getStudentService() {
		return studentService;
	}

	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}
	
	@RequestMapping("studentAddView.do")
	public ModelAndView addView(){
		return new ModelAndView("studentAdd");		
	}
	
	@RequestMapping("/studentAdd.do")
	public ModelAndView studentAdd(@RequestParam(value = "photo") MultipartFile photo,String id,String name,String age,HttpServletRequest request){

		Student student = new Student();
		student.setId(id);
		student.setName(name);
		student.setAge(Integer.parseInt(age));
		
		ServletContext application = request.getServletContext();
		String realPath = application.getRealPath("photo/");
		int index = photo.getOriginalFilename().lastIndexOf(".");
		String suffix = photo.getOriginalFilename().substring(index+1);
		String fileName = realPath+File.separator+id+"."+suffix;
		
		// 存文件到photo中
		try {
			photo.transferTo(new File(fileName));
		} catch (Exception e) {
			e.printStackTrace();
		} 
		student.setPhotoPath(suffix);

		boolean ok = studentService.addStudent(student);
		Map<String,Object> model = new HashMap<String,Object>();
		if(ok){
			List<Student> students = studentService.getStudents();
			model.put("students",students);
			return new ModelAndView("studentList",model);
		}else{
			model.put("info","添加失败");
			return new ModelAndView("studentAdd",model);		
		}
	}
	
	/*
	 * 更新界面
	 */
	@RequestMapping("/studentUpdateView.do")
	public ModelAndView updateView(String id){
		Student student = studentService.findById(id);
		Map<String,Object> model = new HashMap<String,Object>();
		model.put("student",student);
		return new ModelAndView("studentUpdate",model);
	}

	/*
	 * 更新功能
	 */
	@RequestMapping("/studentUpdate.do")
	public ModelAndView updateView(Student student){
		boolean ok = studentService.updateStudent(student);
		Map<String,Object> model = new HashMap<String,Object>();
		List<Student> students = studentService.getStudents();
		model.put("students",students);
		return new ModelAndView("studentList",model);
	}
	
	/*
	 * 删除
	 */
	@RequestMapping("/studentDelete.do")
	public ModelAndView delete(String id){
		boolean ok = studentService.delete(id);
		Map<String,Object> model = new HashMap<String,Object>();
		List<Student> students = studentService.getStudents();
		model.put("students",students);
		return new ModelAndView("studentList",model);
	}

	/*
	 * 查看学生列表
	 */
	@RequestMapping("/studentList.do")
	public ModelAndView studentList(){
		Map<String,Object> model = new HashMap<String,Object>();
		List<Student> students = studentService.getStudents();
		model.put("students",students);
		return new ModelAndView("studentList",model);
	}
	
	/*
	 * 显示照片
	 */
	@RequestMapping("/studentPhoto.do")
	public void studentPhoto(String id,String photoPath,HttpServletRequest request,HttpServletResponse response){
        // 找到文件
		ServletContext application = request.getServletContext();
		String realPath = application.getRealPath("photo/");
		String fileName = realPath+File.separator+id+"."+photoPath;
        File file = new File(fileName);
        if (file.exists()) {
        	byte[] buffer = new byte[1024];
        	FileInputStream fis = null;
        	BufferedInputStream bis = null;
        	try {
        		fis = new FileInputStream(file);
                bis = new BufferedInputStream(fis);
                OutputStream os = response.getOutputStream();
                int i = bis.read(buffer);
                while (i != -1) {
                	os.write(buffer, 0, i);
                	i = bis.read(buffer);
                }
        	}catch(Exception e){
        		e.printStackTrace();
        	}finally{
        		if(bis!=null)
        			try{bis.close();}catch(Exception e){}	
        		if(fis!=null)
        			try{fis.close();}catch(Exception e){}
        	}
        }
	}
}
