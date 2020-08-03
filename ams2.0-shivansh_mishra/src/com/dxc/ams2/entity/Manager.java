package com.dxc.ams2.entity;

public class Manager

{
	private String mgno;
	private String firstname;
	private String lastname; /*
								 create table Manager (mgno varchar(50), firstname varchar(50), lastname
								 varchar(50), loginname varchar(50), password varchar(50), emailID
								 varchar(50));
								 */
	private String loginname;
	private String password;
	private String emailID;

	public String getEmailID() {
		return emailID;					
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	String address;

	@Override
	public String toString() {
		return "Manager [mgno=" + mgno + ", firstname=" + firstname + ", lastname=" + lastname + ", loginname="
				+ loginname + ", password=" + password + "]";
	}

	public String getMgno() {
		return mgno;
	}

	public void setMgno(String mgno) {
		this.mgno = mgno;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
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

	public Manager(String mgno, String firstname, String lastname, String loginname, String password,
			String emailID/*
							 * , String address
							 */) {
		super();
		this.mgno = mgno;
		this.firstname = firstname;
		this.lastname = lastname;
		this.loginname = loginname;
		this.password = password;
		this.emailID = emailID;
//		this.address = address;
	}

}
