package com.dxc.ams2.crud;

import java.util.ArrayList;

import com.dxc.ams2.entity.Agent;
import com.dxc.ams2.entity.CustPolicy;
import com.dxc.ams2.entity.Manager;

public interface ManagerCrud {

	public ArrayList<Manager> listManagers();

	public ArrayList<Agent> listAgents();

	public String agentPerformance(String AGNO);

	public ArrayList<CustPolicy> policyDetail();

	public void addAgent(Agent a);

	public void setTarget(String AGNO, int Target);

	public void logOut();

}
