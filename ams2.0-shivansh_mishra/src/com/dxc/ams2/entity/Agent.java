package com.dxc.ams2.entity;

public class Agent {

	public Agent(String aGNO, String fname, String lname, String loginname, String password, String pType, String bRNO,
			String email, String address, String phoneNo, int target, String targetDate, int pSold) {
		super();
		AGNO = aGNO;
		this.fname = fname;
		this.lname = lname;
		this.loginname = loginname;
		this.password = password; /*
									 create table Agent (AGNO varchar(50), fname varchar(50),lname varchar(50), loginname
									  varchar(50), password varchar(50), pType varchar(50), BRNO varchar(50), email
									  varchar(50), address varchar(50), phoneNo varchar(50), target int, targetDate
									  varchar(50), pSold int );
									 */
		this.pType = pType;
		BRNO = bRNO;
		this.email = email;
		this.address = address;
		this.phoneNo = phoneNo;
		this.target = target;
		this.targetDate = targetDate;
		this.pSold = pSold;
	}

	public String getAGNO() {
		return AGNO;
	}

	public void setAGNO(String aGNO) {
		AGNO = aGNO;
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

	public String getpType() {
		return pType;
	}

	public void setpType(String pType) {
		this.pType = pType;
	}

	public String getBRNO() {
		return BRNO;
	}

	public void setBRNO(String bRNO) {
		BRNO = bRNO;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public int getTarget() {
		return target;
	}

	public void setTarget(int target) {
		this.target = target;
	}

	public String getTargetDate() {
		return targetDate;
	}

	public void setTargetDate(String targetDate) {
		this.targetDate = targetDate;
	}

	public int getpSold() {
		return pSold;
	}

	public void setpSold(int pSold) {
		this.pSold = pSold;
	}

	private String AGNO;
	private String fname;
	private String lname;
	private String loginname;
	private String password;
	private String pType;
	private String BRNO;
	private String email;
	private String address;
	private String phoneNo;
	private int target;
	private String targetDate;
	private int pSold;

	public String toString() {
		return "Agent [AGNO=" + AGNO + ", firstname=" + fname + ", lastname=" + lname + ", loginname=" + loginname
				+ ", password=" + password + ",ptype " + pType + ",BRNO " + BRNO + ",emailid " + email + ",address "
				+ address + ",phoneNo " + phoneNo + ",target " + target + ",targetDate " + targetDate + ",pSold" + pSold
				+ "]";
	}
}
