package com.vinu.jdbc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.vinu.jdbc.dao.JdbcDaoImpl;
import com.vinu.jdbc.model.Student;

/**
 * Unit test for simple JdbcDemo.
 */
//@TestInstance(Lifecycle.PER_CLASS)
public class JdbcDemoTest 
{

	@Test
	@DisplayName("Test getStudent()")
	void testGetCircleJdbcWithoutSpring() {
		
		JdbcDaoImpl jdbcDaoImpl= new JdbcDaoImpl();
		
		Student s1=jdbcDaoImpl.getStudent(2345);
		assertTrue(s1.getStudId().equals(2345));
		assertTrue(s1.getStudName().trim().equals("Ramya Vinu"));
		assertTrue(s1.getStudEmail().trim().equals("ramyaa.vinu@gmail.com"));
		assertTrue(s1.getStudDeptDepId().equals(100));
	}
}
