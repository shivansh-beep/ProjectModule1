package com.dxc.ams2.crud;

import java.util.ArrayList;

import com.dxc.ams2.entity.Agent;
import com.dxc.ams2.entity.Appointment;
import com.dxc.ams2.entity.CustPolicy;
import com.dxc.ams2.entity.Customer;

public interface AgentCrud {
	public ArrayList<Agent> listAgents();

	public ArrayList<CustPolicy> policyDetail();

	public ArrayList<Appointment> appointmentDetails();

	public ArrayList<Customer> customertDetails(String CSNO);

	public void newAppointment(Appointment ap);

	public boolean deleteAppointment(String APNO);

	public void addCustomer(Customer cs);

	public void logOut();
}
