/**
 * 
 */
package com.vinu.jaxrs.messenger.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import lombok.AllArgsConstructor;
//import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Vinu Prabhakaran
 *         on Jun 30, 2020
 *
 */
//@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@XmlRootElement
public class Message {
	
	private Long id;
	private String message;
	private LocalDateTime created;
	private String author;
	private List<Comment> comments;
	
	public Message(Long id, String message, String author) {
		super();
		this.id = id;
		this.message = message;
		this.author = author;
		this.created = LocalDateTime.now();
		this.comments = new ArrayList<Comment>();
	}

	public Long getId() {
		return id;
	}

	public String getMessage() {
		return message;
	}

	public LocalDateTime getCreated() {
		return created;
	}

	public String getAuthor() {
		return author;
	}
	@XmlTransient
	public List<Comment> getComments() {
		return comments;
	}
	
	
	
}
