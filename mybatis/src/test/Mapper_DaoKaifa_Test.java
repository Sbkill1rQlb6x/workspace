package test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.tools.ant.util.SymbolicLinkUtils;

import mapper.UserMapper;
import pojo.User;

public class Mapper_DaoKaifa_Test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		        //1.加载核心文件
				String resource="SqlMapConfig.xml";
				InputStream in=Resources.getResourceAsStream(resource);
				//2.创建sqlsessionfactory
				SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(in);
				//3.创建SqlSession
				SqlSession sqlSession=sqlSessionFactory.openSession();
				//userMapper帮我生成一个实现类（接口）返回的是接口
				UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
				User user= userMapper.findUserById(10);
				System.out.println(user);
	}

}
