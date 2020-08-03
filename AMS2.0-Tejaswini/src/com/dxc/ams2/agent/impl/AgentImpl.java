package com.dxc.ams2.agent.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.dxc.ams2.agent.crud.AgentCrud;
import com.dxc.ams2.dbconnection.DBConnection;
import com.dxc.ams2.entity.Appointment;
import com.dxc.ams2.entity.Customer;
import com.dxc.ams2.manager.impl.ManagerImpl;
import com.dxc.ams2.zonal.impl.ZonalImpl;

public class AgentImpl implements AgentCrud {
	
//connecting to db and getting the connection object
	DBConnection db=new DBConnection();
	Connection c=db.makeConnection();
	
//View all agents information
	@Override
	public void viewAgent() {
		// TODO Auto-generated method stub
		ManagerImpl mg=new ManagerImpl();
		mg.viewAgent();
	}

//Add an appointment 
	@Override
	public void addAppointment(Appointment ap) {
		// TODO Auto-generated method stub
		
		try
		{
			PreparedStatement ps=c.prepareStatement("insert into appointment values(?,?,?,?,?)");
			
			ps.setString(1,ap.getApptno());
			ps.setString(2,ap.getAgno());
			ps.setString(3,ap.getApptdate());
			ps.setString(4,ap.getTime());
			ps.setString(5, ap.getCstname());
			ps.executeUpdate();
			System.out.println("Appointment made sucessfully!!!!");
		}catch(SQLException e)
		{
			e.printStackTrace();
			
		}
			
		
	}
//Delete an appointment 
	@Override
	public void deleteApointment(String apno) {
		// TODO Auto-generated method stub
		try
		{
		PreparedStatement ps=c.prepareStatement("delete from appointment where apptno=(?)");
		
		ps.setString(1, apno);
		ps.executeUpdate();
		
	}catch(SQLException e)
	{
		e.printStackTrace();
		
	}
		System.out.println("Appointment deleted sucessfully!!!");
	}

//adding customers in the database table customer
	@Override
	public void addCustomer(Customer cst) {
		// TODO Auto-generated method stub

		try
		{
			PreparedStatement ps=c.prepareStatement("insert into customer values(?,?,?,?,?,?,?,?,?)");
			
			ps.setString(1,cst.getCstno());
			
			ps.setString(2,cst.getCstfirstname());
			
            ps.setString(3,cst.getCstlastname());
			
			ps.setString(4, cst.getCstloginname());
			
			ps.setString(5, cst.getCstpwd());
			
			ps.setString(6,cst.getCstemail());
			
			ps.setString(7, cst.getCstaddress());
			
			ps.setString(8, cst.getCstphno());
			
			ps.setString(9,cst.getAgno());
			
			ps.execute();
			
			System.out.println("Customer details added sucessfully !!!");
		
		}catch(SQLException e)
		{
			e.printStackTrace();
			
		}
		
		
		
	}
//view the policy details
	@Override
	public void viewPolicyDetails(String custid) {
		// TODO Auto-generated method stub
		ZonalImpl zm=new ZonalImpl();
		zm.viewPolicyDetails(custid);
		
		
	}
//View the appointment information of particular agent
	@Override
	public void viewAppointmentInfo(String agno) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement ps=c.prepareStatement("select * from appointment where agno=(?)");
			
			ps.setString(1, agno);
			ResultSet rs=ps.executeQuery();

			System.out.println("***Details of appointment for AgentID: "+agno+" ****");
			System.out.println();
			System.out.println("APPTNO"+" "+"APPT DATE"+"    "+"APPT TIME"+"   "+"CUSTOMER NAME");
			while(rs.next())
			{
				System.out.println(rs.getString(1)+"   "+rs.getDate(3)+"  "+rs.getString(4)+" "+rs.getString(5));
				
			}

			System.out.println("----------------------------------------------");
			
			
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		   }
		
		
	}
//View the details of the required customer
	@Override
	public void viewCustomerDetails(String custid) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement ps=c.prepareStatement("select * from customer where custno=(?)");
			
			ps.setString(1, custid);
			ResultSet rs=ps.executeQuery();
			System.out.println("***Details of customer with ID: "+custid+" ****");
			System.out.println();
			System.out.println("NAME"+" "+"POLICY NO"+"    "+"DATE"+"   "+"POLICY AMT");
			while(rs.next())
			{
				System.out.println(rs.getString(2)+"   "+rs.getDate(3)+"     "+rs.getString(5));
			}

			System.out.println("----------------------------------------------");
			
			
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		   }
		
	}
// close connection and logout 
	@Override
	public void logout() {
		// TODO Auto-generated method stub
		ZonalImpl zm=new ZonalImpl();
		zm.logout();
	}
	

}
