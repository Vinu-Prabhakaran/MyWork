/**
 * 
 */
package com.vinu.jaxrs.messenger.model;

import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author Vinu Prabhakaran
 *         on Jul 5, 2020
 *
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@XmlRootElement
public class Profile {
	
	private Long id;
	private String profileName;
	private String firstName;
	private String lastName;
	private LocalDateTime created;
	public Profile(Long id, String profileName, String firstName, String lastName) {
		super();
		this.id = id;
		this.profileName = profileName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.created = LocalDateTime.now();
	}
	
	
}
