package com.internousdev.mytest.action;

import com.internousdev.mytest.dao.LoginDAO;
import com.opensymphony.xwork2.ActionSupport;

public class LoginConfirmAction extends ActionSupport{
	private LoginDAO logindao = new LoginDAO();
	private String password;
	private String userName;
	private String mixuser;
	private String errorMessage;

	public String execute(){
		String result = ERROR;

		if(logindao.loginInfo(mixuser, password)){
				result = SUCCESS;
			}else{
				setErrorMessage("ユーザー名またはパスワードが違います");
			}
			return result;
		}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}



	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}



	public String getMixuser() {
		return mixuser;
	}

	public void setMixuser(String mixuser) {
		this.mixuser = mixuser;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}


	}


