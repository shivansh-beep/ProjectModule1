package com.dxc.ams2.entity;

public class ZonalManager {
	private String ZMGNO;
	private String fname; /*
							 * create table ZonalManager (ZMGNO varchar(50), fname varchar(50), lname
							 * varchar(50), loginName varchar(50), password varchar(50));
							 */
	private String lname;
	private String loginName;
	private String password;

	public String toString() {
		return "zonal managers [ZMGNO=" + ZMGNO + ", firstname=" + fname + ", lastname=" + lname + ", loginname="
				+ loginName + ", password=" + password + "]";
	}

	public ZonalManager(String zMGNO, String fname, String lname, String loginName, String password) {
		super();
		ZMGNO = zMGNO;
		this.fname = fname;
		this.lname = lname;
		this.loginName = loginName;
		this.password = password;
	}

	public String getZMGNO() {
		return ZMGNO;
	}

	public void setZMGNO(String zMGNO) {
		ZMGNO = zMGNO;
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

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
