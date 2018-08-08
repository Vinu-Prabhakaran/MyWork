package com.vinu.jdbc;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;


public class UdpateUsingResSet {

public static void main(String[] args) {
		
		try {
			Class.forName(DBConnectConstants.POSTGRESDRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}	
		Connection con=null;
		Properties prop=new Properties();
		InputStream inp = null;
		try {
			inp = new FileInputStream("D:/WorkBench/MyEclipseworkSpace/MyWork/DBConnectPgms/src/main/config/login.properties");
			prop.load(inp);
			System.out.println("UserName :"+prop.getProperty(DBConnectConstants.USER));
			System.out.println("Password :"+prop.getProperty(DBConnectConstants.PASSWORD));
					
		}
		catch(IOException ex)
		{
			System.out.println("Exception "+ex);
			System.exit(0);
		}
		
		try {
			con = DriverManager.getConnection(prop.getProperty(DBConnectConstants.URL),prop);
			System.out.println("PostgreSQL connected succesfully to vinutest DB");
		} 
		catch(Exception ex) {
			System.out.println("Exception "+ex);
		}
		
		try {
			Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE, ResultSet.CLOSE_CURSORS_AT_COMMIT);
			String query="SELECT * FROM  myproduct "
						+" WHERE prodid=2345";
			ResultSet rs=stmt.executeQuery(query);
			
			rs.next();	//first row which matched the serach condition
			System.out.println(rs.getString("prodid")+"\t"+rs.getString("prodname")+rs.getString("rate"));
			rs.updateString("prodname","Samsung HD TV");
			rs.updateRow();
			
		}
		catch(SQLException ex) {
			System.out.println("Exception "+ex);
			System.out.println(ex.getErrorCode());
		}
	}

}


