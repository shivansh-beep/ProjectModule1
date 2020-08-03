package com.dxc.ams2.entity;

public class Appointment {
	private String APID; /*
							  create table Appointment (APID varchar(50), aptDate varchar(50), aptTime
							  varchar(50), cstName varchar(50));
							 */
	private String aptDate;
	private String aptTime;
	private String cstName;

	public String toString() {
		return "Appointment [APID=" + APID + ", aptDate=" + aptDate + ", aptTime=" + aptTime + ", cstName=" + cstName
				+ "]";
	}

	public Appointment(String aPID, String aptDate, String aptTime, String cstName) {
		super();
		APID = aPID;
		this.aptDate = aptDate;
		this.aptTime = aptTime;
		this.cstName = cstName;
	}

	public String getAPID() {
		return APID;
	}

	public void setAPID(String aPID) {
		APID = aPID;
	}

	public String getAptDate() {
		return aptDate;
	}

	public void setAptDate(String aptDate) {
		this.aptDate = aptDate;
	}

	public String getAptTime() {
		return aptTime;
	}

	public void setAptTime(String aptTime) {
		this.aptTime = aptTime;
	}

	public String getCstName() {
		return cstName;
	}

	public void setCstName(String cstName) {
		this.cstName = cstName;
	}

}
