package com.dxc.ams2.crud;

import java.util.ArrayList;

import com.dxc.ams2.entity.CustPolicy;
import com.dxc.ams2.entity.Customer;

public interface CustomerCrud {
	public ArrayList<Customer> customertInfo(String CSNO);
	public ArrayList<CustPolicy> policyDetail();
	public void logOut();
	public boolean changePassword(String CSNO, String oldPassword,String newPassword);

}
