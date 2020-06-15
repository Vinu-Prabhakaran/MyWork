/**
 * 
 */
package com.vinu.jdbc.dao;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;
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
public class JdbcDaoSpringImpl {
	
	private JdbcTemplate jdbcTemplate;

	public int getStudentCount() {
		
		String query="SELECT count(*) FROM student";
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
	
	//Insert Student
	public Boolean insertStudent(Student student) {
		
		String query = "INSERT INTO student values (?,?,?,?)";
		try {
			jdbcTemplate.update(query, 
					new Object[] {student.getStudId(), student.getStudEmail(),student.getStudName(),student.getStudDeptDepId()});
			return true;
		}catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		System.out.println("Setting datasource");
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

}
