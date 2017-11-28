package service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

import entity.Student;

@Service
public class StudentService {
	private static List<Student> students;
	static{
		students = new ArrayList<Student>();
	}
	
	/*
	 * 获取学生信息
	 */
	public List<Student> getStudents() {
		return students;
	}

	/*
	 * 添加学生
	 */
	public boolean addStudent(Student student){
		if(student==null)
			return false;
		for(int i=0;i<students.size();i++){
			if(students.get(i).getId().equals(student.getId())){
				return false;
			}
		}
		students.add(student);
		return true;
	}
	
	public Student findById(String id){
		for(int i=0;i<students.size();i++){
			if(students.get(i).getId().equals(id)){
				return students.get(i);
			}
		}
		return null;
	}
	
	public boolean updateStudent(Student student){
		if(student==null)
			return false;
		for(int i=0;i<students.size();i++){
			if(students.get(i).getId().equals(student.getId())){
				students.set(i, student);
				return true;
			}
		}
		return false;
	}
	
	public boolean delete(String id){
		for(int i=0;i<students.size();i++){
			if(students.get(i).getId().equals(id)){
				students.remove(i);
				return true;
			}
		}
		return false;
	}
	
}
