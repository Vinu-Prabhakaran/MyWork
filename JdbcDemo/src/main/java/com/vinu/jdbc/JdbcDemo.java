/**
 * 
 */
package com.vinu.jdbc;

import com.vinu.jdbc.dao.JdbcDaoImpl;
import com.vinu.jdbc.model.Student;

/**
 * @author Vinu Prabhakaran
 *         on Jun 6, 2020
 *
 */
public class JdbcDemo {
	
	public static void main(String ...args) {
	Student s=new JdbcDaoImpl().getStudent(2345);
	System.out.println(s);
	}
}
