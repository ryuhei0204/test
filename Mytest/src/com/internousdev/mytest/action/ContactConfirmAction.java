package com.internousdev.mytest.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class ContactConfirmAction extends ActionSupport implements SessionAware {

	private String contactname;
	private String contactmail;
	private String contacttel;
	private String title;
	private String contents;
	private String message;
	private Map<String, Object> session;

	public String execute() {
		String result = ERROR;

		session.put("contactname", contactname);
		session.put("contactmail", contactmail);
		session.put("contacttel", contacttel);
		session.put("title", title);
		session.put("contents", contents);

		if (!(contactname.isEmpty() || contactmail.isEmpty() || title.isEmpty() || contents.isEmpty())) {
			result = SUCCESS;
		} else {
			setMessage("必須項目を入力してください");
		}
		return result;

	}

	public String getContactname() {
		return contactname;
	}

	public void setContactname(String contactname) {
		this.contactname = contactname;
	}

	public String getContactmail() {
		return contactmail;
	}

	public void setContactmail(String contactmail) {
		this.contactmail = contactmail;
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

	public String getMessage() {
		return message;
	}

	public String getContacttel() {
		return contacttel;
	}

	public void setContacttel(String contacttel) {
		this.contacttel = contacttel;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}