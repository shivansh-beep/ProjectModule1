package com.dxc.ams2.customer.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.dxc.ams2.customer.operations.CustomerOperations;
import com.dxc.ams2.dbconnection.DBConnection;
import com.dxc.ams2.zonal.impl.ZonalImpl;

public class CustomerImpl implements CustomerOperations {
	
//connecting to db and getting the connection object
	DBConnection db=new DBConnection();
	Connection c=db.makeConnection();

//View the details of customer by providing ID
	@Override
	public void viewSelfDetails(String custid) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<String>();
		try {
			PreparedStatement ps=c.prepareStatement("select * from customer where cstno=(?)");
			
			ps.setString(1, custid);
			ResultSet rs=ps.executeQuery();
			System.out.println("***Details of customer with ID: "+custid+" ****");
			System.out.println();
	
			
			while(rs.next())
			{
				al.add(rs.getString(1));
				al.add(rs.getString(2));
				al.add(rs.getString(3));
				al.add(rs.getString(4));
				al.add(rs.getString(5));
				al.add(rs.getString(6));
				al.add(rs.getString(7));
				al.add(rs.getString(8));
				al.add(rs.getString(9));
				
			}
System.out.println("ID:"+ al.get(0));
System.out.println("NAME:"+al.get(1));
System.out.println("LASTNAME:"+al.get(2));
System.out.println("LOGIN ID:"+al.get(3));
System.out.println("PASSWORD:"+al.get(4));
System.out.println("EMAIL:"+al.get(5));
System.out.println("ADDRESS:"+al.get(6));
System.out.println("PHONENO:"+al.get(7));
System.out.println("AGENT ID:"+al.get(8));

System.out.println("----------------------------------------------");
			
			
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		   }
		
	   }

//Change the password by updating it in the database
	@Override
	public void changePassword(String custid,String newpwd) {
		// TODO Auto-generated method stub
	
		ResultSet rs=null;
		
		
		try {
			

			PreparedStatement ps1=c.prepareStatement("select pwd from customer where cstno=(?)");
			ps1.setString(1,custid);
		    rs=ps1.executeQuery();
		    rs.next();
		
		    
		    
		    
			PreparedStatement ps=c.prepareStatement("update customer set pwd=(?) where cstno=(?)");
			ps.setString(1, newpwd);
			ps.setString(2, custid);
			
	        ps.executeBatch();	
		
	}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		   }
		
		
		
		
		try
		{
			 System.out.println("your new password has been changed from "+rs.getString("pwd")+" to "+newpwd);
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		   }
		
	}

	
//view the policy details of a customer
	@Override
	public void policyDetails(String custid) {
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
	
	
}
