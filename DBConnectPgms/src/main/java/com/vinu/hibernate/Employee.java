/**
 * 
 */
package com.vinu.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Vinu Prabhakaran
 *         on Jan 28, 2020
 *
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Employee {
	@Id
	@Column(name="emp_id")
	private Integer empId;
	@Column(name="emp_name")
	private String empName;
	@Column(name="emp_salary")
	private Integer empSalary;
	
	
}
