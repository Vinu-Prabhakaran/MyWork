/**
 * 
 */
package com.vinu.jdbc.model;

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
public class Student {
	
	Integer studId;
	String studEmail;
	String studName;
	Integer studDeptDepId;
}
