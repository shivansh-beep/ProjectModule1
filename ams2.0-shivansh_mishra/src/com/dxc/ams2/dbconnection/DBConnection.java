package com.dxc.ams2.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection 

{
	Connection c=null;

	public DBConnection()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loadded Succefully");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}


// This method provides and returns the connection for db
	
	public Connection getConnected()
	{
		try {
			c=DriverManager.getConnection("jdbc:mysql://localhost:3306/AMS2","root","root");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	return c;
	
	
	}
	


}
