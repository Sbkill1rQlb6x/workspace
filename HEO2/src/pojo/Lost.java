package pojo;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Lost implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int Lost_id;
	private String Lost_detail;
	
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date Lost_Date;
	private int User_id;
	public int getLost_id() {
		return Lost_id;
	}
	public void setLost_id(int lost_id) {
		Lost_id = lost_id;
	}
	public String getLost_detail() {
		return Lost_detail;
	}
	public void setLost_detail(String lost_detail) {
		Lost_detail = lost_detail;
	}
	public Date getLost_Date() {
		return Lost_Date;
	}
	public void setLost_Date(Date lost_Date) {
		Lost_Date = lost_Date;
	}
	public int getUser_id() {
		return User_id;
	}
	public void setUser_id(int user_id) {
		User_id = user_id;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Lost [Lost_id=" + Lost_id + ", Lost_detail=" + Lost_detail + ", Lost_Date=" + Lost_Date + ", User_id="
				+ User_id + "]";
	}
	
    
}
