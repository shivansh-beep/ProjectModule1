package com.dxc.ams2.zonal.curd;

import com.dxc.ams2.entity.Manager;
import com.dxc.ams2.entity.Branch;

public interface ZonalManagerCurd {
	
	public void viewZonalManager();
	
	public void addManager(Manager m);
	
	public void viewManager();
	
	public void viewAgent();
	
	public void viewPolicyDetails(String custid);
	
	public void replaceManager(String managerid,String branchno);

	public void addBranch(Branch b);
	
	public void logout();
	



}
