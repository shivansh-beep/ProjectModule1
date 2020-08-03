package com.dxc.ams2.entity;

public class Customer {
	private String CSNO; /*
							  create table Customer (CSNO varchar(50), fname varchar(50), lname
							  varchar(50), loginname varchar(50), password varchar(50), emailID
							  varchar(50), address varchar(50), phone varchar(50));
							 */
	private String fname;
	private String lname;
	private String loginname;
	private String password;
	private String emailID;
	private String address;
	private String phone;

	public Customer(String cSNO, String fname, String lname, String loginname, String password, String emailID,
			String address, String phone) {
		super();
		CSNO = cSNO;
		this.fname = fname;
		this.lname = lname;
		this.loginname = loginname;
		this.password = password;
		this.emailID = emailID;
		this.address = address;
		this.phone = phone;
	}

	public String getCSNO() {
		return CSNO;
	}

	public void setCSNO(String cSNO) {
		CSNO = cSNO;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String toString() {
		return "Customers [CSNO=" + CSNO + ", firstname=" + fname + ", lastname=" + lname + ", loginname=" + loginname
				+ ", password=" + password + ",emailID " + emailID + ",address " + address + ",phoneNo " + phone + "]";
	}
}
