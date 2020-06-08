/**
 * 
 */
package com.vinu.jdbc;

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
		Student s=cntxt.getBean("jdbcDaoSpringImpl", JdbcDaoSpringImpl.class).getStudent(2345);
		//Student s=new JdbcDaoImpl().getStudent(2345);
		System.out.println(s);
	}
}
