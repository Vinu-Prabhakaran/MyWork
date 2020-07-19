/**
 * 
 */
package com.vinu.jaxrs.messenger.resources;


import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Singleton;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import com.vinu.jaxrs.messenger.model.Message;
import com.vinu.jaxrs.messenger.service.MessageService;

/**
 * @author Vinu Prabhakaran
 *         on Jun 30, 2020
 *
 */
@Path("/messages")
@Singleton
public class MessageResource {
	
	private MessageService messageService = new MessageService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> getMessages(@QueryParam("year") Integer year,
									 @QueryParam("start") Integer start,
									 @QueryParam("size") Integer size) {
		
		if (year == null && start == null && size == null) {
			return messageService.getMessages();
		}
		else if(year != null && start == null && size == null){
			return messageService.getMessagesByYear(year);
		}
		else if(year == null && start != null && size != null){
			return messageService.getMessagesPaginated(start, size);
		}else {
			return new ArrayList<Message>();
		}
	}
	
	@GET
	@Path("/{messageId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Message getMessage(@Context UriInfo uriInfo,@PathParam("messageId") String messageId) {
		
		Message message= messageService.getMessage(new Long(messageId));
		message.addLink(getUrlToSelf(uriInfo,message), "self");
		return message;
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response addMessage(Message message,@Context UriInfo uriInfo) throws URISyntaxException {
		
		Message newMessage=messageService.addMessage(message);
		Response response=Response.created(uriInfo.getAbsolutePathBuilder().path(newMessage.getId().toString()).build())
								  .entity(newMessage)
								  .build();
		return response;
	}
	
	@DELETE
	@Path("/{messageId}")
	public Boolean deleteMessage(@PathParam("messageId") String messageId) {
		
		return messageService.deleteMessage(new Long(messageId));
	}
	
	@PUT
	@Path("/{messageId}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Message updateMessage(Message message,@PathParam("messageId") String messageId) {
		
		message.setId(new Long(messageId));
		return messageService.updateMessage(message);
	}
	
	
	@Path("/{messageId}/comments")
	public CommentResource getCommentResource() {
		
		return new CommentResource();
	}
	
	
	private String getUrlToSelf(UriInfo uriInfo, Message message) {

		return uriInfo.getBaseUriBuilder()
				.path(MessageResource.class)
				.path(Long.toString(message.getId()))
				.build()
				.toString();
	}
}
