/**
 * 
 */
package com.vinu.jdbc;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vinu.jdbc.dao.JdbcDaoImpl;
import com.vinu.jdbc.dao.JdbcDaoSpringImpl;
import com.vinu.jdbc.model.Student;

/**
 * @author Vinu Prabhakaran
 *         on Jun 6, 2020
 *
 */
public class JdbcDemo {
	
	public static void main(String ...args) {
		ApplicationContext cntxt=new ClassPathXmlApplicationContext("spring.xml");
		JdbcDaoSpringImpl jdbcDaoSpringImpl=cntxt.getBean("jdbcDaoSpringImpl", JdbcDaoSpringImpl.class);
		Student s=jdbcDaoSpringImpl.getStudent(2345);
		//Student s=new JdbcDaoImpl().getStudent(2345);
		System.out.println(s);
		try {
			System.out.println("Student Count :"+jdbcDaoSpringImpl.getStudentCount());
			System.out.println("Student Name for 3456 is "+jdbcDaoSpringImpl.getStudentName(3456));
			System.out.println("Student Record for 4567 is "+jdbcDaoSpringImpl.getStudentForId(4567));
			System.out.println("Student Table Contents \n"+jdbcDaoSpringImpl.getAllStudents());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
