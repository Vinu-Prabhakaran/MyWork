/**
 * 
 */
package com.vinu.jaxrs.messenger.resources;


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
import javax.ws.rs.core.MediaType;

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
	
	private MessageService messageService;
	
	public MessageResource() {
		
		messageService = new MessageService();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> getMessages() {
		
		return messageService.getMessages();
	}
	
	@GET
	@Path("/{messageId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Message getMessage(@PathParam("messageId") String messageId) {
		
		return messageService.getMessage(new Long(messageId));
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Message addMessage(Message message) {
		
		return messageService.addMessage(message);
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
}
