package com.dxc.ams2.entity;

public class Branch {
	private String BRNO; /*
							 * create table Branch(BRNO varchar(50), brName varchar(50), brAddress
							 * varchar(50), ZMGNO varchar(50), manager varchar(50));
							 */
	private String brName;
	private String brAddress;
	private String ZMGNO;
	private String manager;

	public String toString() {
		return "Branch [BRNO=" + BRNO + ", brName=" + brName + ", brAddress=" + brAddress + ", ZMGNO=" + ZMGNO
				+ ",manager" + manager + "]";

	}

	public Branch(String bRNO, String brName, String brAddress, String zMGNO, String manager) {
		super();
		BRNO = bRNO;
		this.brName = brName;
		this.brAddress = brAddress;
		ZMGNO = zMGNO;
		this.manager = manager;
	}

	public String getBRNO() {
		return BRNO;
	}

	public void setBRNO(String bRNO) {
		BRNO = bRNO;
	}

	public String getBrName() {
		return brName;
	}

	public void setBrName(String brName) {
		this.brName = brName;
	}

	public String getBrAddress() {
		return brAddress;
	}

	public void setBrAddress(String brAddress) {
		this.brAddress = brAddress;
	}

	public String getZMGNO() {
		return ZMGNO;
	}

	public void setZMGNO(String zMGNO) {
		ZMGNO = zMGNO;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	
}
