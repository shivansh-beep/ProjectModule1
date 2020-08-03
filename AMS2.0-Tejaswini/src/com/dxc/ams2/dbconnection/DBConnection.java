package com.dxc.ams2.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

Connection c=null;

//for loading the driver

public DBConnection()
{
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		System.out.println("Driver Loadded Succefully");
	} catch (ClassNotFoundException e) {
		
		e.printStackTrace();
	}
}

//This method makes the connection to database 'amspro' and returns connection object
public Connection makeConnection()
{
	try {
		c=DriverManager.getConnection("jdbc:mysql://localhost:3306/amspro","root","12345");
		
	} catch (SQLException e) {
	
		e.printStackTrace();
	}
	
return c;


}
	
	
public boolean checkConnection(Connection c)
{
	Boolean b=false;
	if(c==null)
	{
		b=false;
		System.out.println("connection failed");
		
	}
	else if(c!=null)
	{
		b=true;
		System.out.println("Succesfully Connected to Database 'amspro'");
		
	}
	
	return b;
}

	
}

