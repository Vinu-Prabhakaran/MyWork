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

import org.postgresql.Driver;

public class QueryTable {

public static void main(String[] args) {
		
		Driver d = new Driver();
		Connection con=null;
		Properties prop=new Properties();
		InputStream inp = null;
		try {
			inp = new FileInputStream("D:/WorkBench/MyEclipseworkSpace/MyWork/DBConnectPgms/src/main/config/login.properties");
			prop.load(inp);
			System.out.println("UserName :"+prop.getProperty("user"));
			System.out.println("Password :"+prop.getProperty("password"));
					
		}
		catch(IOException ex)
		{
			System.out.println("Exception "+ex);
			System.exit(0);
		}
		
		try {
			DriverManager.registerDriver(d);
			con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/vinutest",prop);
			System.out.println("PostgreSQL connected succesfully to vinutest DB");
		} 
		catch(Exception ex) {
			System.out.println("Exception "+ex);
		}
		
		try {
			Statement stmt=con.createStatement();
			String query="SELECT * FROM department";
			ResultSet rs=stmt.executeQuery(query);
			System.out.println("**** Details from department Table ****");
			System.out.println("Id\tDepartment\t\t\t\t\tEmployeeId");	
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+rs.getInt(3));
			}
		}
		catch(SQLException ex) {
			System.out.println("Exception "+ex);
			System.out.println(ex.getErrorCode());
		}
	}

}

