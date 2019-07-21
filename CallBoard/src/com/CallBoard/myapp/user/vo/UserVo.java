package com.CallBoard.myapp.user.vo;

public class UserVo {

	private String Uname;
	
	private String user_id;
	
	private String user_pass;
	
	private String user_pass2;
	
	private String user_nickname;

	private String m_email;
	
	private String status;

	
	String getUname() {
		return Uname;
	}

	public void setUname(String uname) {
		Uname = uname;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getUser_pass() {
		return user_pass;
	}

	public void setUser_pass(String user_pass) {
		this.user_pass = user_pass;
	}

	public String getUser_pass2() {
		return user_pass2;
	}

	public void setUser_pass2(String user_pass2) {
		this.user_pass2 = user_pass2;
	}

	public String getUser_nickname() {
		return user_nickname;
	}

	public void setUser_nickname(String user_nickname) {
		this.user_nickname = user_nickname;
	}

	public String getM_email() {
		return m_email;
	}

	public void setM_email(String m_email) {
		this.m_email = m_email;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
