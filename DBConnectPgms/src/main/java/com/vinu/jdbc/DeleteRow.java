package com.vinu.jdbc;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;


public class DeleteRow {

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
			Statement stmt=con.createStatement();
			String query="DELETE FROM myproduct "
						+"WHERE prodid=3456";
			int updCnt=stmt.executeUpdate(query);
			System.out.println("No:of rows updated :"+updCnt);
			
		}
		catch(SQLException ex) {
			System.out.println("Exception "+ex);
			System.out.println(ex.getErrorCode());
		}
	}

}


