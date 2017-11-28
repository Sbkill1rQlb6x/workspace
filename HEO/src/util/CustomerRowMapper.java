package util;

import java.sql.ResultSet;
import java.sql.SQLException;

import entity.User;

public class CustomerRowMapper {
	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		User user = new User();
		user.setUserName(rs.getString("USERNAME"));
		user.setEmail(rs.getString("EMAIL"));
		user.setPassword(rs.getString("PASSWORD"));
		return user;
	}

}
