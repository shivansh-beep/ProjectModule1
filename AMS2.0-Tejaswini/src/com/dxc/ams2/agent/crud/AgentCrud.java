package com.dxc.ams2.agent.crud;

import com.dxc.ams2.entity.Appointment;
import com.dxc.ams2.entity.Customer;

public interface AgentCrud {

	public void viewAgent();
	public void addAppointment(Appointment ap);
	public void deleteApointment(String apno);
	public void addCustomer(Customer c);
	public void viewPolicyDetails(String custid);
	public void viewAppointmentInfo(String agno);
	public void viewCustomerDetails(String custid);
	public void logout();
	
	
	
	
}
