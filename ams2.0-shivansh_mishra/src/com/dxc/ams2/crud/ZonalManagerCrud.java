package com.dxc.ams2.crud;

import java.util.ArrayList;

import com.dxc.ams2.entity.Agent;
import com.dxc.ams2.entity.Branch;
import com.dxc.ams2.entity.CustPolicy;
import com.dxc.ams2.entity.Manager;
import com.dxc.ams2.entity.ZonalManager;

public interface ZonalManagerCrud {
	public ArrayList<ZonalManager> listZonalManagers();

	public ArrayList<Manager> listManagers();

	public ArrayList<Agent> listAgents();

	public ArrayList<CustPolicy> policyDetail();

	public void addBranch(Branch b);

	public void addManager(Manager m);

	public boolean replaceManager(String BRNO, String manager);

	public void logOut();
}
