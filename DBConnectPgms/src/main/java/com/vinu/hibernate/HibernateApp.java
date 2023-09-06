/**
 * 
 */
package com.vinu.hibernate;

import java.io.File;
import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * @author Vinu Prabhakaran
 *         on Jan 26, 2020
 *
 */
public class HibernateApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Department> dList=Arrays.asList(new Department(100,"EC"),
				  new Department(200,"Mech"),
				  new Department(300,"Civil"));
		List<Student> sList=Arrays.asList(//new Student(1234, "Vinu Prabhakaran", "vinu.cp@gmail.com"),
										  new Student(2345, "Ramya Vinu", "ramyaa.vinu@gmail.com",new Department(100,"EC")),
										  new Student(3456, "Ameya Vinu", "ameya.vinu@gmail.com",new Department(200,"Mech")),
										  new Student(4567, "Aditi Vinu", "aditi.vinu@gmail.com",new Department(300,"Civil")));
		
		Configuration conf=new Configuration()
					       .configure(new File("DBConnectPgms/src/main/resources/hibernate.cfg.xml"))
					       .addAnnotatedClass(Student.class)
					       .addAnnotatedClass(Department.class);
		SessionFactory sf= conf.buildSessionFactory();
		Session session = sf.openSession();
		
		Transaction tx=null;
		tx = session.beginTransaction();
		//Adding rows to Department table
		dList.forEach(d -> session.save(d));
		//Adding rows to Student table
		sList.forEach(s -> session.save(s));
		System.out.println("Fetching Student");
		Student s = (Student)session.get(Student.class, 2345);
		tx.commit();
		System.out.println("Fetched Row "+s);

	}

}
