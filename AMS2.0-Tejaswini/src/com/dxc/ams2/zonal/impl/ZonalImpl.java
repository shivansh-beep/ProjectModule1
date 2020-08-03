package com.dxc.ams2.zonal.impl;
import com.dxc.ams2.zonal.curd.ZonalManagerCurd;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.dxc.ams2.dbconnection.DBConnection;
import com.dxc.ams2.entity.Branch;
import com.dxc.ams2.entity.Manager;
import com.dxc.ams2.manager.impl.ManagerImpl;

public class ZonalImpl implements ZonalManagerCurd {
	
//connecting to db and getting the connection object	
	DBConnection db=new DBConnection();
	Connection c=db.makeConnection();
	
//Adding manager to the manager table	
	@Override
	public void addManager(Manager m) {
		// TODO Auto-generated method stub
		if(db.checkConnection(c))
		{
		
		try {
			PreparedStatement ps=c.prepareStatement("insert into manager values(?,?,?,?,?,?,?,?,?)");
			
			ps.setString(1, m.getMgno());
			
			ps.setString(2, m.getFirstname());
			
			ps.setString(3, m.getLastname());
			
			ps.setString(4, m.getLoginname());
			
			ps.setString(5, m.getPassword());
			
			ps.setString(6,m.getEmailid());
			
			ps.setString(7, m.getAddress());
			
			ps.setString(8, m.getPhno());
			
			ps.setString(9,m.getBrno());
			
			
			ps.executeUpdate();
			
			System.out.println("Manager details added successfully!!!!");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
	}//end of if
	}

//Adding branch to table branch by zonal manager	
	@Override
	public void addBranch(Branch b) {
		// TODO Auto-generated method stub
		if(db.checkConnection(c))
		{
		
		try {
			PreparedStatement ps=c.prepareStatement("insert into branch values(?,?,?,?)");
			
			ps.setString(1, b.getBrno());
			
			ps.setString(2, b.getBrname());
			
			ps.setString(3, b.getBraddress());
			
			ps.setString(4, b.getZmno());
		
			ps.executeUpdate();
			
			System.out.println("Branch details added successfully!!!");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
	}	
		
	}

//Displaying the list of managers present in the database
	@Override
	public void viewManager() {
		// TODO Auto-generated method stub
		if(db.checkConnection(c))
		{
		
		try {
			Statement st=c.createStatement();
			ResultSet rs=st.executeQuery("select * from manager");
			int i=1;
			System.out.println("------------Managers list and their details-----------");
			System.out.println("SLno"+" "+"ID"+"  "+"NAME"+"    "+"PHONE NO."+"   "+"EMAIL"+"BRANCH NO.");
			while(rs.next())
			{
				System.out.println(i+" . "+rs.getString(1)+" "+rs.getString(2)+"   "+rs.getString(8)+"   "+rs.getString(6)+"  "+rs.getString(9));
				i++;
			}
			System.out.println("----------------------------------------------");
			
			
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		   }
	   }

	}
	
//Displaying the list of agents and their details
	@Override
	public void viewAgent() {
		// TODO Auto-generated method stub
		
		
		ManagerImpl mg=new ManagerImpl();
		mg.viewAgent();
	   }
		
		

//Displaying the list of policy details
	@Override
	public void viewPolicyDetails(String custid) {
		// TODO Auto-generated method stub
		
		try {
			PreparedStatement ps=c.prepareStatement("select * from policydetails where custno=(?)");
			
			ps.setString(1, custid);
			ResultSet rs=ps.executeQuery();
		    int i=1;
			System.out.println("***Policy details of customer with ID: "+custid+" ****");
			System.out.println();
			System.out.println("SLno"+" "+"POLICY NO"+"    "+"DATE"+"   "+"POLICY AMT");
			while(rs.next())
			{
				System.out.println(i+" . "+rs.getString(1)+"   "+rs.getDate(3)+"     "+rs.getString(5));
				i++;
			}

			System.out.println("----------------------------------------------");
			
			
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		   }
	   }

		
//Replacing the manager to different branch
	@Override
	public void replaceManager(String managerid ,String branchno) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement ps=c.prepareStatement("update manager set brno=(?) where mgno=(?)");
			
			ps.setString(1, branchno);
			ps.setString(2, managerid);
			ps.executeUpdate();
		   
		    System.out.println("Manager is replaced to required branch");
		    System.out.println("----------------------------------------------");
		
	    }catch (SQLException e) {
		// TODO Auto-generated catch block
		 e.printStackTrace();
	   }
	} 

	
//Displaying list of zonal managers present in database
	@Override
	public void viewZonalManager() {
		// TODO Auto-generated method stub
		
		if(db.checkConnection(c))
		{
		
		try {
			Statement st=c.createStatement();
			ResultSet rs=st.executeQuery("select * from zonalmanager");
			int i=1;
			System.out.println("------------Zonal Manager details-----------");
			System.out.println("SLno"+" "+"NAME"+"    "+"PHONE NO."+"   "+"EMAIL");
			while(rs.next())
			{
				System.out.println(i+" . "+rs.getString(2)+"   "+rs.getString(7)+"   "+rs.getString(6));
				i++;
			}
			System.out.println("----------------------------------------------");
			
			
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		   }
	   }
		
	}

//logout and close connection of db
	@Override
	public void logout() {
		// TODO Auto-generated method stub
		
		try
		{
		c.close();
		System.out.println("connection closed for amspro database!!!!");
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		   }
		System.exit(0);
	}
	

	}//end of class

	

