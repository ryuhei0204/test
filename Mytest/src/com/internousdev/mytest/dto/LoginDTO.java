package com.internousdev.mytest.dto;

public class LoginDTO {
	private int id;
	private String logId;
	private String logPass;
	private String logName;

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

	public String getLogName() {
		return logName;
	}

	public void setLogName(String logName) {
		this.logName = logName;
	}

}
