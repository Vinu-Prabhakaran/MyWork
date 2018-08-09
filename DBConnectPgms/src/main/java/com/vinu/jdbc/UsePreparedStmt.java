package com.vinu.jdbc;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;


public class UsePreparedStmt {

public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
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
			
			String name;
			Statement stmt=con.createStatement();
			String query="SELECT * FROM myproduct";
			ResultSet rs=stmt.executeQuery(query);
			System.out.println("**** Details from myproduct Table ****");
			System.out.println("ProdId\tProductName\tPrice");	
			
			while(rs.next()) {
				System.out.println(rs.getString("prodid")+"\t"+rs.getString("prodname")+"\t"+rs.getString("rate"));
				}
			String updQuery="UPDATE myproduct SET prodname=? WHERE prodid=?";
			PreparedStatement pstmt=con.prepareStatement(updQuery);
			System.out.println("Enter the ID to change");
			int id = sc.nextInt();
			System.out.println("Enter the new Name");
			name = sc.next();
			pstmt.setString(1, name);
			pstmt.setInt(2, id);
			int updCnt=pstmt.executeUpdate();
			System.out.println("No:of rows updated :"+updCnt);
			
		}
		catch(SQLException ex) {
			System.out.println("Exception "+ex);
			System.out.println(ex.getErrorCode());
		}

		sc.close();
				
	}

}


