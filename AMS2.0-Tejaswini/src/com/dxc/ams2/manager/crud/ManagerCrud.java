package com.dxc.ams2.manager.crud;

import com.dxc.ams2.entity.Agent;

public interface ManagerCrud {
	public void viewManager();
	public void viewAgent();
	public void addAgent(Agent a);
	public void viewAgentPerformance(String agid);
	public void setTarget(String agno,int target);
	public void viewPolicyDetails(String custid);
    public void logout();
	
	
	
	
	
	
	

}
