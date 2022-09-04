package com.ecom.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AdminDAO 
{
	private Connection con;
	public AdminDAO()
	{
		con=DBConnection.getConnection();
	}
	
	public Boolean Login(String email,String password)
	{
		try
		{
		String query="select * from admin where email=? and password=?";
		
		PreparedStatement ps;
		ps=con.prepareStatement(query);
		
		ps.setString(1, email);
		ps.setString(2, password);
		
		ResultSet rs=ps.executeQuery();
		return rs.next();
		}
		catch(SQLException e)
		{
			System.out.println(e);
			return false;
		}
	}

}
