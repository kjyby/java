package entity;

import java.io.Serializable;


public class CMember implements Serializable {
	
	private static final long serialVersionUID = 1L;
	// attributes
	private String userID;
	private String password;

	public String getUserID() {return userID;}
	public String getPassword() {return password;}
	public void setUserID(String userID) {this.userID = userID;}
	public void setPassword(String password) {this.password = password;}

}
