package mapper;


import pojo.User;

public interface UserMapper {
	public int addUser(User user);
	public User loginRequest(String userName);
}
