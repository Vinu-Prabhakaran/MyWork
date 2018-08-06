package com.vinu.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

import org.postgresql.Driver;

public class TestJDBCConnect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Connection con = null;
		try {
			//To Load a Driver use with Class.forName or create a Driver instance and register it with DriverManager.
			//Class.forName("org.postgresql.Driver");	//Loads the JDBC Driver and registers it with Driver Manager
			//refer https://stackoverflow.com/questions/20078586/why-we-use-class-forname-oracle-jdbc-driver-oracledriver-while-connecting-to
			//http://cs-fundamentals.com/java-programming/java-jdbc-connection-tutorial.php
			Driver d = new Driver();
			DriverManager.registerDriver(d);
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres", "admin");
			System.out.println("PostgreSQL connected succesfully");
			con.close();
		}
		catch(Exception ex)
		{
			System.out.println("Exception "+ex);
			System.exit(0);
		}
		
	}

}
