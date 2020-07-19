/**
 * 
 */
package com.vinu.jaxrs.messenger.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
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
	private List<Comment> comments = new ArrayList<>();
	private List<Link> links = new ArrayList<>();
	
	public Message(Long id, String message, String author) {
		super();
		this.id = id;
		this.message = message;
		this.author = author;
		this.created = LocalDateTime.now();
		this.comments = new ArrayList<Comment>();
	}
	
	public Message(Long id, String message, LocalDateTime localDateTime, String author) {
		super();
		this.id = id;
		this.message = message;
		this.author = author;
		this.created = localDateTime;
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
	
	public void addLink(String uri,String ref) {
		
		this.links.add(new Link(uri,ref));
	}

	public List<Link> getLinks() {
		return links;
	}
	
	
}
