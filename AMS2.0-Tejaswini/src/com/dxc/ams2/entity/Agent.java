package com.dxc.ams2.entity;

public class Agent {

	String agno ;
	String firstname ;
	String lastname ;
	String loginname;
	String pwd ;
	String brno ;
	String policytype; 
	String address; 
	String phno ;
	String email ;
    int target ;
    int policysold ;
    String targetsetdate;
    String targetdate ;
    
	
	public Agent(String agno, String firstname, String lastname, String loginname, String pwd, String brno,
			String policytype, String address, String phno, String email, int target, int policysold,
			String targetsetdate, String targetdate) {
		super();
		this.agno = agno;
		this.firstname = firstname;
		this.lastname = lastname;
		this.loginname = loginname;
		this.pwd = pwd;
		this.brno = brno;
		this.policytype = policytype;
		this.address = address;
		this.phno = phno;
		this.email = email;
		this.target = target;
		this.policysold = policysold;
		this.targetsetdate = targetsetdate;
		this.targetdate = targetdate;
	}

	
	@Override
	public String toString() {
		return "Agent [agno=" + agno + ", firstname=" + firstname + ", lastname=" + lastname + ", loginname="
				+ loginname + ", pwd=" + pwd + ", brno=" + brno + ", policytype=" + policytype + ", address=" + address
				+ ", phno=" + phno + ", email=" + email + ", target=" + target + ", policysold=" + policysold
				+ ", targetsetdate=" + targetsetdate + ", targetdate=" + targetdate + "]";
	}


	public String getLoginname() {
		return loginname;
	}


	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}


	public String getAgno() {
		return agno;
	}

	public void setAgno(String agno) {
		this.agno = agno;
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

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getBrno() {
		return brno;
	}

	public void setBrno(String brno) {
		this.brno = brno;
	}

	public String getPolicytype() {
		return policytype;
	}

	public void setPolicytype(String policytype) {
		this.policytype = policytype;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getTarget() {
		return target;
	}

	public void setTarget(int target) {
		this.target = target;
	}

	public int getPolicysold() {
		return policysold;
	}

	public void setPolicysold(int policysold) {
		this.policysold = policysold;
	}

	public String getTargetsetdate() {
		return targetsetdate;
	}

	public void setTargetsetdate(String targetsetdate) {
		this.targetsetdate = targetsetdate;
	}

	public String getTargetdate() {
		return targetdate;
	}

	public void setTargetdate(String targetdate) {
		this.targetdate = targetdate;
	}
	
	
	
	
	
	
	
	
}
