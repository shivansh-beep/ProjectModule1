package com.dxc.ams2.entity;

public class Branch {

	
	String brno;
	String brname;
	String braddress;
	String zmno;
	
	
	public Branch(String brno, String brname, String braddress, String zmno) {
		super();
		this.brno = brno;
		this.brname = brname;
		this.braddress = braddress;
		this.zmno = zmno;
	}
	
	
	@Override
	public String toString() {
		return "Branch [brno=" + brno + ", brname=" + brname + ", braddress=" + braddress + ", zmno=" + zmno + "]";
	}
	public String getBrno() {
		return brno;
	}
	public void setBrno(String brno) {
		this.brno = brno;
	}
	public String getBrname() {
		return brname;
	}
	public void setBrname(String brname) {
		this.brname = brname;
	}
	public String getBraddress() {
		return braddress;
	}
	public void setBraddress(String braddress) {
		this.braddress = braddress;
	}
	public String getZmno() {
		return zmno;
	}
	public void setZmno(String zmno) {
		this.zmno = zmno;
	}
	
	
	
	
	
	
	
	
}
