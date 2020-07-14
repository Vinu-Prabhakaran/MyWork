/**
 * 
 */
package com.vinu.jaxrs.messenger.model;

import java.time.LocalDateTime;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Vinu Prabhakaran
 *         on Jun 30, 2020
 *
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@XmlRootElement
public class Comment {
	
	private Long id;
	private String message;
	private LocalDateTime created;
	private String author;
	
	public Comment(Long id, String message, String author) {
		this.id = id;
		this.message = message;
		this.author = author;
		this.created = LocalDateTime.now();
	}
	
}
