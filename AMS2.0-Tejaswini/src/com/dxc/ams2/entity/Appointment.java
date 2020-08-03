package com.dxc.ams2.entity;

public class Appointment {
String apptno;
String agno;
String apptdate;
String time;
String cstname;
public Appointment(String apptno, String agno, String apptdate, String time, String cstname) {
	super();
	this.apptno = apptno;
	this.agno = agno;
	this.apptdate = apptdate;
	this.time = time;
	this.cstname = cstname;
}
@Override
public String toString() {
	return "Appointment [apptno=" + apptno + ", agno=" + agno + ", apptdate=" + apptdate + ", time=" + time
			+ ", cstname=" + cstname + "]";
}
public String getApptno() {
	return apptno;
}
public void setApptno(String apptno) {
	this.apptno = apptno;
}
public String getAgno() {
	return agno;
}
public void setAgno(String agno) {
	this.agno = agno;
}
public String getApptdate() {
	return apptdate;
}
public void setApptdate(String apptdate) {
	this.apptdate = apptdate;
}
public String getTime() {
	return time;
}
public void setTime(String time) {
	this.time = time;
}
public String getCstname() {
	return cstname;
}
public void setCstname(String cstname) {
	this.cstname = cstname;
}

	
	
	
	
	
	
	
	
}
