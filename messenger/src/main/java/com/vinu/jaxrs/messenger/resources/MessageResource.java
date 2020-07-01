/**
 * 
 */
package com.vinu.jaxrs.messenger.resources;


import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
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
public class MessageResource {
	
	private MessageService messageService= new MessageService();
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Message> getMessages() {
		
		return messageService.getMessages();
	}
}
