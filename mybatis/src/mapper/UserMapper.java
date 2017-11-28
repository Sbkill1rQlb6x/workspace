package mapper;

import pojo.User;

public interface UserMapper {
	//动态代理方法开发dao（解决原始dao开发的实现类的重复代码）
	//遵循四个原则:1.接口方法名等于User.xml中的id名（findUserById）。2.返回值类型与Mapper.xml文件中返回值类型要一致
	//3.方法的入参类型与mapper.xml中入参要一致
	//方法的入参类型与Mapper.xml中入参类型一致
	//在user2.xml中
	public User findUserById(Integer id);
}
