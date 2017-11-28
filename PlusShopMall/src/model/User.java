package model;

import java.util.List;
import java.util.Map;

import util.DBUtil;

public class User {

	private DBUtil db;
	
	public User(){
		super();
		db=new DBUtil();
	}

	public int createNewUser(Map<String, String> userInfo) {
		String sql = "INSERT INTO user (user_name,user_pw,user_email,user_phone) VALUES (?,?,?,?)";
		return db.update(sql, new String[]{userInfo.get("user_name"),userInfo.get("user_pw"),userInfo.get("user_email"),userInfo.get("user_phone")});
	}

	public Map<String, String> login(String userName, String userPw) {
		String sql = "select * from user where user_name=? and user_pw=?";
		List list = db.getList(sql, new String[] { userName, userPw });
		if (list != null && list.size() != 0) {
			return (Map<String, String>) list.get(0);
		} else {
			return null;
	}
	
	}

	public Map<String, String> appLogin(String username, String password) {
		String sql = "select * from user where user_name=? and user_pw=?";
		List list = db.getList(sql, new String[] {username, password });
		if (list != null && list.size() != 0) {
			return (Map<String, String>) list.get(0);
		} else {
			return null;
	}
	}

	}
