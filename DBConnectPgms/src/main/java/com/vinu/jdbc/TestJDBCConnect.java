package com.vinu.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJDBCConnect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Connection con = null;
		try {
			Class.forName("org.postgresql.Driver");
			//refer https://stackoverflow.com/questions/20078586/why-we-use-class-forname-oracle-jdbc-driver-oracledriver-while-connecting-to
			//http://cs-fundamentals.com/java-programming/java-jdbc-connection-tutorial.php
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
