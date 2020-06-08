/**
 * 
 */
package com.vinu.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.postgresql.Driver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.vinu.jdbc.model.Student;

/**
 * @author Vinu Prabhakaran
 *         on Jun 6, 2020
 *
 */
@Component
public class JdbcDaoSpringImpl {
	
	@Autowired
	DataSource dataSource;
	
	public Student getStudent(Integer studId) {
		Connection con=null;
		try {
			con = dataSource.getConnection();
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
