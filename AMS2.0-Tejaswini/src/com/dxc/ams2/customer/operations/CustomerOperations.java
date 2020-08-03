package com.dxc.ams2.customer.operations;

public interface CustomerOperations {

	public void viewSelfDetails(String custid);
	public void changePassword(String custid,String newpwd);
	public void policyDetails(String custid);
	public void logout();
	
	
	
	
	
	
}
