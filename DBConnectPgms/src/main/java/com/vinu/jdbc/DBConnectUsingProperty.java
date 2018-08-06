package com.vinu.jdbc;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

import org.postgresql.Driver;

public class DBConnectUsingProperty {

	public static void main(String[] args) {
		
		Properties prop=new Properties();
		InputStream inp = null;
		try {
			inp = new FileInputStream("D:/WorkBench/MyEclipseworkSpace/MyWork/DBConnectPgms/src/main/config/config.properties");
			prop.load(inp);
			
			System.out.println("DataBase :"+prop.getProperty("database"));
			System.out.println("UserName :"+prop.getProperty("dbuser"));
			System.out.println("Password :"+prop.getProperty("dbpassword"));
			
		}
		catch(IOException ex)
		{
			System.out.println("Exception "+ex);
			System.exit(0);
		}
		
		try {
		Driver d = new Driver();
		DriverManager.registerDriver(d);
		Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/"+prop.getProperty("database"),prop.getProperty("dbuser"),prop.getProperty("dbpassword"));
		System.out.println("PostgreSQL connected succesfully to "+prop.getProperty("database"));
		con.close();
		}
		catch(Exception ex) {
			System.out.println("Exception "+ex);
		}
	}

}