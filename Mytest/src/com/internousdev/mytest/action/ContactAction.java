package com.internousdev.mytest.action;
import com.opensymphony.xwork2.ActionSupport;

public class ContactAction extends ActionSupport{
	private String contactname;
	private String contactmail;
	private String contacttel;
	private String title;
	private String contents;

	public String execute(){
		return SUCCESS;
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

	public String getContacttel() {
		return contacttel;
	}

	public void setContacttel(String contacttel) {
		this.contacttel = contacttel;
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


}
