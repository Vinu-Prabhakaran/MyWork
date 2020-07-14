/**
 * 
 */
package com.vinu.jaxrs.messenger.resources;

import java.util.List;

import javax.inject.Singleton;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.vinu.jaxrs.messenger.model.Comment;
import com.vinu.jaxrs.messenger.service.CommentService;

/**
 * @author Vinu Prabhakaran
 *         on Jul 12, 2020
 *
 */
@Singleton
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class CommentResource {
	
	private CommentService commentService = new CommentService();
	
	@GET
	@Path("/")
	public List<Comment> getCommentsForId(@PathParam("messageId") String messageId) {
		
		return commentService.getComments(Long.valueOf(messageId));
	}
	
	@GET
	@Path("/{commentId}")
	public Comment getCommentForId(@PathParam("messageId") String messageId,@PathParam("commentId") String commentId) {
		
		try {
			return commentService.getComment(Long.valueOf(messageId),Long.valueOf(commentId));
		}catch(NotFoundException e) {
			return null;
		}
	}
	
	@POST
	@Path("/")
	public Comment addComment(@PathParam("messageId") String messageId, Comment comment) {
		
		return commentService.addComment(Long.valueOf(messageId),comment);
	}
	
	@DELETE
	@Path("/{commentId}")
	public Boolean deleteComment(@PathParam("messageId") String messageId,@PathParam("commentId") String commentId) {
		
		return commentService.deleteComment(Long.valueOf(messageId),Long.valueOf(commentId));
	}
	
	@PUT
	@Path("/{commentId}")
	public Comment updateComment(@PathParam("messageId") String messageId,@PathParam("commentId") String commentId,Comment comment) {
		
		comment.setId(Long.valueOf(commentId));
		return commentService.updateComment(Long.valueOf(messageId),comment);
	}
}
