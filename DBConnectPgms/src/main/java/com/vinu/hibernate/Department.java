/**
 * 
 */
package com.vinu.hibernate;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;

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
//@Embeddable
@Entity
public class Department {
	@Id
	private Integer depId;
	private String depName;
}
