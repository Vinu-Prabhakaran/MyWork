/**
 * 
 */
package com.vinu.jaxrs.messenger.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import javax.ws.rs.NotFoundException;

import com.vinu.jaxrs.messenger.exceptions.DataNotFoundException;
import com.vinu.jaxrs.messenger.model.Comment;

/**
 * @author Vinu Prabhakaran
 *         on Jun 30, 2020
 *
 */
public class CommentService {
	
	private MessageService messageService = new MessageService();
	
	public List<Comment> getComments(Long messageId){
		return messageService.getMessage(messageId).getComments();
	}
	
	public Comment getComment(Long messageId,Long id) {
		
		return messageService.getMessage(messageId)
				   .getComments() == null ? null:messageService.getMessage(messageId)
				   .getComments()
				   .stream()
				   .filter(c -> c.getId().equals(id))
				   .findFirst()
				   .orElseThrow(() -> new NotFoundException());
	}
	
	public Comment addComment(Long messageId,Comment comment) {
		
		comment.setId((long) (messageService.getMessage(messageId)
				   							.getComments().size()+1));
		comment.setCreated(LocalDateTime.now());
		messageService.getMessage(messageId)
		   			  .getComments()
		   			  .add(comment);
		return comment;
	}
	
	public Comment updateComment(Long messageId,Comment comment) {
		
		if (messageService.getMessage(messageId).getComments().stream().anyMatch(c -> c.getId().equals(comment.getId()))) {
			
			comment.setCreated(LocalDateTime.now());
			List<Comment> comments=messageService.getMessage(messageId).getComments();
			comments.set(comments.indexOf(comments.stream()
				   .filter(c -> c.getId().equals(comment.getId()))
				   .findFirst().get()),comment);
			return comment;
						
		} else {
			throw new DataNotFoundException("Matching Comment not found");
		}
	}
	
	public Boolean deleteComment(Long messageId,Long id) {

		if (messageService.getMessage(messageId).getComments().stream().anyMatch(c -> c.getId().equals(id))) {
			
			return messageService.getMessage(messageId).getComments().removeAll(messageService.getMessage(messageId).getComments().stream()
				   .filter(c -> c.getId().equals(id)).collect(Collectors.toList()));
						
		} else {
			throw new DataNotFoundException("Matching Comment not found");
		}		
	}
	
}
