package com.dxc.ams2.entity;

public class Customer {
 
	String cstno;
	String cstfirstname;
	String cstlastname;
	String cstloginname;
	String cstpwd;
	String cstemail;
	String cstaddress;
	String cstphno;
	String agno;
	public Customer(String cstno, String cstfirstname, String cstlastname, String cstloginname, String cstpwd,
			String cstemail, String cstaddress, String cstphno, String agno) {
		super();
		this.cstno = cstno;
		this.cstfirstname = cstfirstname;
		this.cstlastname = cstlastname;
		this.cstloginname = cstloginname;
		this.cstpwd = cstpwd;
		this.cstemail = cstemail;
		this.cstaddress = cstaddress;
		this.cstphno = cstphno;
		this.agno = agno;
	}
	@Override
	public String toString() {
		return "Customer [cstno=" + cstno + ", cstfirstname=" + cstfirstname + ", cstlastname=" + cstlastname
				+ ", cstloginname=" + cstloginname + ", cstpwd=" + cstpwd + ", cstemail=" + cstemail + ", cstaddress="
				+ cstaddress + ", cstphno=" + cstphno + ", agno=" + agno + "]";
	}
	public String getCstno() {
		return cstno;
	}
	public void setCstno(String cstno) {
		this.cstno = cstno;
	}
	public String getCstfirstname() {
		return cstfirstname;
	}
	public void setCstfirstname(String cstfirstname) {
		this.cstfirstname = cstfirstname;
	}
	public String getCstlastname() {
		return cstlastname;
	}
	public void setCstlastname(String cstlastname) {
		this.cstlastname = cstlastname;
	}
	public String getCstloginname() {
		return cstloginname;
	}
	public void setCstloginname(String cstloginname) {
		this.cstloginname = cstloginname;
	}
	public String getCstpwd() {
		return cstpwd;
	}
	public void setCstpwd(String cstpwd) {
		this.cstpwd = cstpwd;
	}
	public String getCstemail() {
		return cstemail;
	}
	public void setCstemail(String cstemail) {
		this.cstemail = cstemail;
	}
	public String getCstaddress() {
		return cstaddress;
	}
	public void setCstaddress(String cstaddress) {
		this.cstaddress = cstaddress;
	}
	public String getCstphno() {
		return cstphno;
	}
	public void setCstphno(String cstphno) {
		this.cstphno = cstphno;
	}
	public String getAgno() {
		return agno;
	}
	public void setAgno(String agno) {
		this.agno = agno;
	}
	
	
	
	
	
}
