package com.Vtiger.CRM.Generic.DatabaseUtility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class Database_Utility {
	
	Connection con;
	ResultSet Select_result;
	int update_result;
	
	public void getConnection()
	{
	
	try {
		
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tekpyramid", "root", "root");
		
	}
	catch(Exception e)
	{
		
	}
	
	}
	public void closeConnection() throws SQLException
	{
		con.close();
	}
	
	public ResultSet executeSelect(String query)
	{
		try {
		
		Statement stt = con.createStatement();
		 Select_result = stt.executeQuery(query);
		
		}
		catch(Exception e){
			
		}	
		return Select_result;
	}
	
	public int executeNonSelect(String query)
	{
		try {
		
		Statement stt = con.createStatement();
		update_result = stt.executeUpdate(query);
		
		}
		catch(Exception e){
			
		}	
		return update_result;
	}

	}

