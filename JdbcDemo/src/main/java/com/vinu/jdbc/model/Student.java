/**
 * 
 */
package com.vinu.jdbc.model;

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
 *         on Jun 6, 2020
 *
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Student {
	
	@Id
	@Column(name="studid")
	Integer studId;
	@Column(name="studemail")
	String studEmail;
	@Column(name="studname")
	String studName;
	@Column(name="studdept_depid")
	Integer studDeptDepId;
}
