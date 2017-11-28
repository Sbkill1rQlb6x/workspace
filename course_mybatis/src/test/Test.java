package test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import pojo.Course;

public class Test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String resourse="SqlMapConfig.xml";
	InputStream inputStream= Resources.getResourceAsStream(resourse);
	SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	SqlSession sqlSession=sqlSessionFactory.openSession();
	
	
	List<Course> course = sqlSession.selectList("test.findCourse");
	for(Course c:course)
	{
		System.out.println(c);
	}
	
	Course courseId = sqlSession.selectOne("test.findCourseById",3);
	System.out.println(courseId);
	}

}
