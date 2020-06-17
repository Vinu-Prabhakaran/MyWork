/**
 * 
 */
package com.vinu.jdbc.dao;

import org.hibernate.SessionFactory;
import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vinu.jdbc.model.Student;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Vinu Prabhakaran
 *         on Jun 14, 2020
 *
 */
@Repository
@Getter
@Setter
public class HibernateDaoImpl {
	
	@Autowired
	SessionFactory sessionFactory;
	
	public long getStudentCount() {
		
		String hql="SELECT count(*) FROM Student";
		Query query= this.getSessionFactory()
				.openSession()
				.createQuery(hql);
		return (Long)query.uniqueResult();
	}

	public Student getStudentDetails(int studId) {
		
		String hql="from Student where studId = "+studId;
		return (Student)this.getSessionFactory()
			.openSession()
			.createQuery(hql)
			.uniqueResult();
	}
}
