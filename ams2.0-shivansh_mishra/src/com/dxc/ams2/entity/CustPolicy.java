package com.dxc.ams2.entity;

public class CustPolicy {
	private String PNO;
	private String CNO; /*
						 * create table CustPolicy (PNO varchar(50), CNO varchar(50), pDate varchar(50),
						 * years varchar(50), payMent varchar(50), mode varchar(50), premium
						 * varchar(50));
						 */
	private String pDate;
	private String years;
	private String payMent;
	private String mode;
	private String premium;

	public String toString() {
		return "zonal managers [PNO=" + PNO + ", CNO=" + CNO + ", pDate=" + pDate + ", years=" + years + ", payMent="
				+ payMent + ",mode " + mode + ",premium " + premium + "]";
	}

	public CustPolicy(String pNO, String cNO, String pDate, String years, String payMent, String mode, String premium) {
		super();
		PNO = pNO;
		CNO = cNO;
		this.pDate = pDate;
		this.years = years;
		this.payMent = payMent;
		this.mode = mode;
		this.premium = premium;
	}

	public String getPNO() {
		return PNO;
	}

	public void setPNO(String pNO) {
		PNO = pNO;
	}

	public String getCNO() {
		return CNO;
	}

	public void setCNO(String cNO) {
		CNO = cNO;
	}

	public String getpDate() {
		return pDate;
	}

	public void setpDate(String pDate) {
		this.pDate = pDate;
	}

	public String getYears() {
		return years;
	}

	public void setYears(String years) {
		this.years = years;
	}

	public String getPayMent() {
		return payMent;
	}

	public void setPayMent(String payMent) {
		this.payMent = payMent;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public String getPremium() {
		return premium;
	}

	public void setPremium(String premium) {
		this.premium = premium;
	}

}
