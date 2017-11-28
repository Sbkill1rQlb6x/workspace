package test;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import MapperInterface.CourseInterface;
import pojo.Course;

public class MapperTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String resource="SqlMapConfig.xml";
		InputStream in = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		CourseInterface mapper = sqlSession.getMapper(CourseInterface.class);
		Course course=mapper.findCourseById(1);
		System.out.println(course);
	}

}
