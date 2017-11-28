package pojo;

public class User {
	private int UserId;
	private String UserName;
	private String Email;
	private String password;
	public int getUserId() {
		return UserId;
	}
	public void setUserId(int userId) {
		UserId = userId;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		this.UserName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		this.Email = email;
	}
	@Override
	public String toString() {
		return "User [userName=" + UserName + ", password=" + password + ", email=" + Email + "]";
	}
	
}
