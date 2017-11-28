package test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import mapper.UserMapper;
import pojo.User;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//测试mapper
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserMapper mapper =(UserMapper) ac.getBean("userMapper");
		User user = mapper.selectUserById(1);
		System.out.println(user);
	}

}
