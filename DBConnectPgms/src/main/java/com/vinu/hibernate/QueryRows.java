/**
 * 
 */
package com.vinu.hibernate;

import java.io.File;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

/**
 * @author Vinu Prabhakaran
 *         on Jan 26, 2020
 *
 */
public class QueryRows {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Configuration conf=new Configuration()
					       .configure(new File("src/main/resources/hibernate-update.cfg.xml"))
					       .addAnnotatedClass(Employee.class);
		SessionFactory sf= conf.buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		
		Query<Employee> query = session.createQuery("from Employee");
		List<Employee> empList=query.list();
		System.out.println("**** All rows from Employee Table");
		empList.forEach(System.out::println);
		
		System.out.println("**** Entire row for a  particular empId");
		query=session.createQuery("from Employee where empId = 1034");
		query.uniqueResultOptional().ifPresent(System.out::println);
		
		System.out.println("**** Name and Salary where empId = 1050");
		Query<Object[]> query1=session.createQuery("select empName,empSalary from Employee where empId = 1050");
		Object[] res=query1.uniqueResult();
		for (Object o: res) {
			System.out.print(o+" ");
		}
		
		System.out.println("\n**** Name and Salary where salary > 5000");
		int sal = 5000;
		Query query2=session.createQuery("select empName,empSalary from Employee where empSalary > :sal");
		query2.setParameter("sal", sal);
		List<Object[]> resList=query2.list();
		resList.forEach(objArr -> {
			for (Object obj: objArr) {
				System.out.print(obj+" ");
			}
			System.out.println();
		});
		
		System.out.println("\n**** Employee name salary where salary is max");
		Query query3=session.createQuery("select empName,empSalary from Employee where empSalary = (select max(empSalary) from Employee)");
		Object[] maxSalEmp=(Object[])query3.uniqueResult();
		for (Object o: maxSalEmp) {
			System.out.print(o+" ");
		}
		//Commit all changes
		session.getTransaction().commit();
	}

}
