/**
 * 
 */
package com.vinu.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.postgresql.Driver;

import com.vinu.jdbc.model.Student;

/**
 * @author Vinu Prabhakaran
 *         on Jun 6, 2020
 *
 */
public class JdbcDaoImpl {
	
	public Student getStudent(Integer studId) {
	
		Driver d = new Driver();
		Connection con=null;
	
		try {
			DriverManager.registerDriver(d);
			con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","admin");
			System.out.println("PostgreSQL connected succesfully to vinutest DB");
		} 
		catch(Exception ex) {
			System.out.println("Exception "+ex);
		}
		
		try {
			String query="SELECT * FROM student where studid=?";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setInt(1, studId);
			ResultSet rs=ps.executeQuery();
			System.out.println("**** Details from student Table ****");	
			if(rs.next()) {
				return new Student(studId,rs.getString("studemail"),rs.getString("studname"),Integer.parseInt(rs.getString("studdept_depid")));
							}
		}
		catch(SQLException sqlEx) {
			System.out.println("Exception "+sqlEx);
			System.out.println(sqlEx.getErrorCode());
		}
		return null;
	}
}
