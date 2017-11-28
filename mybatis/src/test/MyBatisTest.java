package test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.*;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import pojo.User;
/*
 * sqlsession 不要公用一个
 * */


public class MyBatisTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//1.加载核心文件
		String resource="SqlMapConfig.xml";
		InputStream in=Resources.getResourceAsStream(resource);
		//2.创建sqlsessionfactory
		SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(in);
		//3.创建SqlSession
		SqlSession sqlSession=sqlSessionFactory.openSession();
		//4.执行sql语句 第二个参数是入参
		
		//通过id查询
		User user= sqlSession.selectOne("test.findUserById", 10);
		System.out.println(user);
		
		//通过用户名模糊查询 
		List<User> users=sqlSession.selectList("test.findUserByUserName","五");
		for(User u:users)
		{
			System.out.println(u);
		}
		
		//添加用户
	/*	User user2=new User();
		user2.setUsername("曾志伟");
		user2.setBirthday(new Date());
		user2.setAddress("sadsa");
		user2.setSex("男");
		int i=sqlSession.insert("test.insertUser", user2);
		//insert需要提交事务
		sqlSession.commit();
		
		//将插入的数据的ID返回来
		User user3=new User();
		user3.setUsername("迪丽热巴");
		user3.setBirthday(new Date());
		user3.setAddress("sadsa");
		user3.setSex("女");
		int j=sqlSession.insert("test.insertUser2", user3);
		//insert需要提交事务
		sqlSession.commit();
		System.out.println(user3.getId());
		*/
		
		
		//修改用户
		User user4=new User();
		user4.setId(33);
		user4.setUsername("赵四");
		user4.setBirthday(new Date());
		user4.setAddress("sadsa");
		user4.setSex("男");
		int k=sqlSession.update("test.updatetUserById", user4);
		sqlSession.commit();
		
		//删除用户
		sqlSession.delete("test.deleteUserById", 24);
		sqlSession.commit();
		
		sqlSession.close();
	}

}
