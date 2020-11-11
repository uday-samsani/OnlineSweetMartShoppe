package com.cg.osm.entites;

public class User {
	private long userId ;
	private String userName ;
	private String password ;
	private String passwordConfirm ;
	private String type ;
	public User(long userId, String userName, String password, String passwordConfirm, String type) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.passwordConfirm = passwordConfirm;
		this.type = type;
	}
	
	
	// for getting unique hash
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (userId ^ (userId >>> 32));
		return result;
	}


	// whether objects are same or not
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (userId != other.userId)
			return false;
		return true;
	}



	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPasswordConfirm() {
		return passwordConfirm;
	}
	public void setPasswordConfirm(String passwordConfirm) {
		this.passwordConfirm = passwordConfirm;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
}
