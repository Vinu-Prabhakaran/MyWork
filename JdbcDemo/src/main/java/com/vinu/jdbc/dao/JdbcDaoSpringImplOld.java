/**
 * 
 */
package com.vinu.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.postgresql.Driver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.vinu.jdbc.model.Student;

/**
 * @author Vinu Prabhakaran
 *         on Jun 6, 2020
 *
 */
@Component
public class JdbcDaoSpringImplOld {
	
	//@Autowired
	DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	public Student getStudent(Integer studId) {
		Connection con=null;
		try {
			con = dataSource.getConnection();
			System.out.println("PostgreSQL connected succesfully to vinutest DB");
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
	
	public int getStudentCount() {
		
		String query="SELECT count(*) FROM student";
		//jdbcTemplate.setDataSource(dataSource); 
		return jdbcTemplate.queryForInt(query);
	}
	
	public String getStudentName(Integer studId) {
		
		String query="SELECT studname FROM student where studid = ?";
		return jdbcTemplate.queryForObject(query,new Object[] {studId}, String.class);
	}
	
	public Student getStudentForId(Integer studId) {

		String query="SELECT * FROM student where studid = ?";
		return jdbcTemplate.queryForObject(query, new Object[] {studId}, new StudentMapper());
	}
	
	//Inner class for RowMapper implementation
	public static final class StudentMapper implements RowMapper<Student>{

		@Override
		public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
			Student student=new Student();
			student.setStudId(rs.getInt("studid"));
			student.setStudEmail(rs.getString("studemail"));
			student.setStudName(rs.getString("studname"));
			student.setStudDeptDepId(rs.getInt("studdept_depid"));
			return student;
		}
		
	}
	
	//getAllStudent rows
	public List<Student> getAllStudents() {

		String query="SELECT * FROM student";
		return jdbcTemplate.query(query, new StudentMapper());
	}
	
	public DataSource getDataSource() {
		return dataSource;
	} 
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		System.out.println("Setting datasource");
		this.jdbcTemplate = new JdbcTemplate(dataSource);
		this.dataSource = dataSource;
	}
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
}
