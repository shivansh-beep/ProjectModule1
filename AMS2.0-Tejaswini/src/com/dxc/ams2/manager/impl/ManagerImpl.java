package com.dxc.ams2.manager.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.dxc.ams2.dbconnection.DBConnection;
import com.dxc.ams2.entity.Agent;
import com.dxc.ams2.manager.crud.ManagerCrud;
import com.dxc.ams2.zonal.impl.ZonalImpl;

public class ManagerImpl implements ManagerCrud {
	
	
//connecting to db and getting the connection object	
	DBConnection db=new DBConnection();
	Connection c=db.makeConnection();
	
	
//Displaying the list of managers present in the database
	@Override
	public void viewManager() {
		// TODO Auto-generated method stub
		
		ZonalImpl zm=new ZonalImpl();
		zm.viewManager();
		
	}

	
//Adding data to agent table in database	
	@Override
	public void addAgent(Agent a) {
			// TODO Auto-generated method stub
			try {
				PreparedStatement ps=c.prepareStatement("insert into agent values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
				
				ps.setString(1, a.getAgno());
				
				ps.setString(2, a.getFirstname());
				
				ps.setString(3, a.getLastname());
				
				ps.setString(4, a.getLoginname());
				
				ps.setString(5, a.getPwd());
				
				ps.setString(6,a.getBrno());
				
				ps.setString(7, a.getPolicytype());
				
				ps.setString(8, a.getAddress());
				
				ps.setString(9, a.getPhno());
				
				ps.setString(10,a.getEmail());
				
				ps.setInt(11, a.getTarget());
				
				ps.setInt(12, a.getPolicysold());
				
				ps.setString(13, a.getTargetdate());
				
				ps.setString(14, a.getTargetsetdate());
				
				ps.executeUpdate();
				
				System.out.println("Agent details added successfully!!!");
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		   }
		}

	
//Displaying the list of agents and their details
	@Override
	public void viewAgent() {
		// TODO Auto-generated method stub
		
		try {
			Statement st=c.createStatement();
			ResultSet rs=st.executeQuery("select * from agent");
			int i=1;
			
			System.out.println("------------Agent details-----------");
			System.out.println("SLno"+" "+"AGENT NO."+"   "+"NAME"+"    "+"PHONE NO."+"   "+"EMAIL"+"          "+" TARGET"+"   "+"POLICIES "+" "+"BRANCH NO."+" "+"TARGET DATE");
			while(rs.next())
			{
				System.out.println(i+" .  "+rs.getString(1)+"     "+rs.getString(2)+"    "+rs.getString(9)+"  "+rs.getString(10)+"       "+rs.getString(11)+"         "+rs.getString(12)+"  "+rs.getString(6)+"    "+rs.getString(14));
			
				i++;
			}
			System.out.println("----------------------------------------------");
			
			
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		   }
	   }
		

//agent performance
	@Override
	public void viewAgentPerformance(String agid) {
		// TODO Auto-generated method stub
		

	try {
		PreparedStatement ps=c.prepareStatement("select agno,firstname,target,policysold from agent where agno=(?)");
		ps.setString(1, agid);	
		ResultSet rs=ps.executeQuery();
		ArrayList<Float> al=new ArrayList<Float>();
		while(rs.next())
		{
			al.add(rs.getFloat(3));
			al.add(rs.getFloat(4));
		}
		Float ab=(al.get(0)/al.get(1))*100;
		System.out.println("Target policies given :"+al.get(0));
		System.out.println("policies sold: "+al.get(1));
		System.out.println("The percentage performance of the agent "+rs.getString(2)+" is "+ab);
		
	}
	catch (SQLException e) {
		// TODO Auto-generated catch block
		 e.printStackTrace();
	   }
		
	}

	
//setting target to the agent 
	@Override
	public void setTarget(String agno,int target) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement ps=c.prepareStatement("update agent set target=(?) where agno=(?)");
			
			ps.setInt(1, target);
			ps.setString(2, agno);
			ps.executeUpdate();
		   
		    System.out.println("Agent "+agno+" has been set the target of "+target);
		    System.out.println("----------------------------------------------");
		
	    }catch (SQLException e) {
		// TODO Auto-generated catch block
		 e.printStackTrace();
	   }
		
	}
	
//Displaying the list of policy details
	@Override
	public void viewPolicyDetails(String custid) {
		// TODO Auto-generated method stub
		
		ZonalImpl zm=new ZonalImpl();
		zm.viewPolicyDetails(custid);
		
	   }
		
	
//logout and close connection of db
		@Override
		public void logout() {
			// TODO Auto-generated method stub
			ZonalImpl zm=new ZonalImpl();
			zm.logout();
			
		}

}//end of class
