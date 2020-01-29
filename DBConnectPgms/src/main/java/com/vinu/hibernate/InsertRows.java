/**
 * 
 */
package com.vinu.hibernate;

import java.io.File;
import java.util.Random;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @author Vinu Prabhakaran
 *         on Jan 26, 2020
 *
 */
public class InsertRows {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Configuration conf=new Configuration()
					       .configure(new File("src/main/resources/hibernate.cfg.xml"))
					       .addAnnotatedClass(Employee.class);
		SessionFactory sf= conf.buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		
		Random r = new Random();
		
		for (int i=1;i <= 50;i++) {
			session.save(new Employee(1000+i,"Employee#"+i,r.nextInt(8999)+1000));
		}
		
		
		//Commit all changes
		session.getTransaction().commit();
	}

}
