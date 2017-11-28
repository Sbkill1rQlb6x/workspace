package service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import entity.Student;
import mapper.StudentMapper;

@Service
public class StudentService {
	
	@Resource
	StudentMapper studentMapper;
	
	
	public StudentMapper getStudentMapper() {
		return studentMapper;
	}

	public void setStudentMapper(StudentMapper studentMapper) {
		this.studentMapper = studentMapper;
	}

	/*
	 * 获取学生信息
	 */
	public List<Student> getStudents() {
		return studentMapper.getStudents();
	}

	/*
	 * 添加学生
	 */
	public boolean addStudent(Student student){
		studentMapper.addStudent(student);
		return true;
	}	
	public Student findById(String id){
		return studentMapper.findById(id);
	}	
	public boolean updateStudent(Student student){
		return studentMapper.updateStudent(student)>0;
	}	
	public boolean delete(String id){
		return studentMapper.delete(id)>0;
	}	
}
