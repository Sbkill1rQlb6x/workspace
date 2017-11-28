package action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
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
	public ModelAndView studentAdd(String id,String name,String age){
		Student student = new Student();
		student.setId(id);
		student.setName(name);
		student.setAge(Integer.parseInt(age));
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
	
}
