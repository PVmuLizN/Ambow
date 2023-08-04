package edu.sdp.po;

public class User {
	private int uid;
	private String loginname;
	private String password;

	public User(String loginname, String password) {
		this.loginname=loginname;
		this.password=password;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getLoginname() {
		return loginname;
	}

	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public User() {
	}

	public User(int uid, String loginname, String password) {
		this.uid = uid;
		this.loginname = loginname;
		this.password = password;
	}
}
