package dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import entity.User;
@Repository
public class UserDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public void add(User user){
		String sql = "insert into User values(?,?,?)";
		System.out.println(user.getUserName()+user.getEmail()+user.getPassword());
		jdbcTemplate.update(sql,
				new Object[]{user.getUserName(),user.getEmail(),user.getPassword()});
	}


}
