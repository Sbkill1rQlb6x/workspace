package service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import mapper.UserMapper;
import pojo.User;

@Service
public class UserService {
 
	@Resource
	UserMapper userMapper;

	public UserMapper getUserMapper() {
		return userMapper;
	}

	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}
	
	public boolean addUser(User user)
	{
		return userMapper.addUser(user)==1;
	}
	public User loginRequest(String userName)
	{
		return userMapper.loginRequest(userName);
	}
}
