package com.internousdev.ecsite.dto;

public class LoginDTO {
	private String username;
	private String password;
	private String loginid;
	private String loginpassword;
	private boolean loginflg;

	public String getUserName() {
		return username;
	}

	public void setUserName(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLoginId() {
		return loginid;
	}

	public void setLoginId(String loginid) {
		this.loginid = loginid;
	}

	public String getLoginPassword() {
		return loginpassword;
	}

	public void setLoginPassword(String loginpassword) {
		this.loginpassword = loginpassword;
	}

	public boolean getLoginFlg() {
		return loginflg;
	}

	public void setLoginFlg(boolean loginflg) {
		this.loginflg = loginflg;
	}

}