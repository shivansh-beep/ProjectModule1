package com.dxc.ams2.entity;

public class Manager 

{
	
String mgno;
String firstname;
String lastname;
String loginname;
String password;
String emailid;
String address;
String phno;
String brno;




@Override
public String toString() {
	return "Manager [mgno=" + mgno + ", firstname=" + firstname + ", lastname=" + lastname + ", loginname=" + loginname
			+ ", password=" + password + ", emailid=" + emailid + ", address=" + address + ", phno=" + phno + ", brno="
			+ brno + "]";
}



//constructor

public Manager(String mgno, String firstname, String lastname, String loginname, String password, String emailid,
		String address, String phno, String brno) {
	super();
	this.mgno = mgno;
	this.firstname = firstname;
	this.lastname = lastname;
	this.loginname = loginname;
	this.password = password;
	this.emailid = emailid;
	this.address = address;
	this.phno = phno;
	this.brno = brno;
}


//setters and getters

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
public String getEmailid() {
	return emailid;
}

public void setEmailid(String emailid) {
	this.emailid = emailid;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getPhno() {
	return phno;
}

public void setPhno(String phno) {
	this.phno = phno;
}

public String getBrno() {
	return brno;
}

public void setBrno(String brno) {
	this.brno = brno;
}

	



}