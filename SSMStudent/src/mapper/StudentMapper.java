package mapper;

import java.util.List;
import entity.Student;
public interface StudentMapper {
	public List<Student> getStudents(); 
	public int addStudent(Student student);
	public Student findById(String id);
	public int updateStudent(Student student);
	public int delete(String id);
}
