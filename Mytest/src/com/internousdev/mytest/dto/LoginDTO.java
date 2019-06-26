package com.internousdev.mytest.dto;

public class LoginDTO {
	private int id;
	private String logId;
	private String logPass;
	private String username;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLogId() {
		return logId;
	}

	public void setLogId(String logId) {
		this.logId = logId;
	}

	public String getLogPass() {
		return logPass;
	}

	public void setLogPass(String logPass) {
		this.logPass = logPass;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
