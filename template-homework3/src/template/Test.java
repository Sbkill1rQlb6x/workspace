package template;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student=new Student();
		Teacher teacher=new Teacher();
		System.out.println("学生准备去学校：");
		student.prepareGotoSchool();
		System.out.println("--------------");
		System.out.println("教师准备去学校：");
		teacher.prepareGotoSchool();
	}

}
