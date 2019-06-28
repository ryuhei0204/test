package com.internousdev.mytest.action;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.mytest.dao.LoginDAO;
import com.opensymphony.xwork2.ActionSupport;

public class ContactCompleteAction extends ActionSupport implements SessionAware{

	String result;
    int check;
	private String conname;
	private String conmail;
	private String contel;
	private String title;
	private String contents;
	private Map<String,Object>session;

	public String execute(){

		conname = String.valueOf(session.get("contactname"));
		conmail = String.valueOf(session.get("contactmail"));
		contel = String.valueOf(session.get("contacttel"));
		title = String.valueOf(session.get("title"));
		contents = String.valueOf(session.get("contents"));

		session.remove("contactname");
		session.remove("contactmail");
		session.remove("contacttel");
		session.remove("title");
		session.remove("contents");

		LoginDAO dao = new LoginDAO();
		check = dao.ContactInfo(conname, conmail, contel, title, contents);

		if(check == 0){
			result = ERROR;
		}else{
			result = SUCCESS;
		}
		return result;
	}

	public String getConname() {
		return conname;
	}

	public void setConname(String conname) {
		this.conname = conname;
	}

	public String getConmail() {
		return conmail;
	}

	public void setConmail(String conmail) {
		this.conmail = conmail;
	}

	public String getContel() {
		return contel;
	}

	public void setContel(String contel) {
		this.contel = contel;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}




}
