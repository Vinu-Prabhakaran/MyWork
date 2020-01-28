/**
 * 
 */
package com.vinu.hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Vinu Prabhakaran
 *         on Jan 26, 2020
 *
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Student {
	
	@Id
	private Integer studId;
	private String studName;
	private String studEmail;
	@ManyToOne
	private Department studDept;
	
	
}
