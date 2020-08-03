package com.dxc.ams2.entity;

public class ZonalManager {

	String zmno;
	String znfirstname;
	String znlastname;
	String znloginname;
	String znpwd;
	String znemail;
	String znphno;
	
	public ZonalManager(String zmno, String znfirstname, String znlastname, String znloginname, String znpwd,
			String znemail, String znphno) {
		super();
		this.zmno = zmno;
		this.znfirstname = znfirstname;
		this.znlastname = znlastname;
		this.znloginname = znloginname;
		this.znpwd = znpwd;
		this.znemail = znemail;
		this.znphno = znphno;
	}
	
	
	public String getZnemail() {
		return znemail;
	}


	public void setZnemail(String znemail) {
		this.znemail = znemail;
	}


	public String getZmno() {
		return zmno;
	}
	public void setZmno(String zmno) {
		this.zmno = zmno;
	}
	public String getZnfirstname() {
		return znfirstname;
	}
	public void setZnfirstname(String znfirstname) {
		this.znfirstname = znfirstname;
	}
	public String getZnlastname() {
		return znlastname;
	}
	public void setZnlastname(String znlastname) {
		this.znlastname = znlastname;
	}
	public String getZnloginname() {
		return znloginname;
	}
	public void setZnloginname(String znloginname) {
		this.znloginname = znloginname;
	}
	public String getZnpwd() {
		return znpwd;
	}
	public void setZnpwd(String znpwd) {
		this.znpwd = znpwd;
	}
	public String getZnphno() {
		return znphno;
	}
	public void setZnphno(String znphno) {
		this.znphno = znphno;
	}


	@Override
	public String toString() {
		return "ZonalManager [zmno=" + zmno + ", znfirstname=" + znfirstname + ", znlastname=" + znlastname
				+ ", znloginname=" + znloginname + ", znpwd=" + znpwd + ", znemail=" + znemail + ", znphno=" + znphno
				+ "]";
	}
	
	
	
	
	
	
}
