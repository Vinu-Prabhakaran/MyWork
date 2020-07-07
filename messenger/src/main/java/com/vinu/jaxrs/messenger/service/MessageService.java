/**
 * 
 */
package com.vinu.jaxrs.messenger.service;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.ws.rs.NotFoundException;

import com.vinu.jaxrs.messenger.model.Message;

/**
 * @author Vinu Prabhakaran
 *         on Jun 30, 2020
 *
 */
public class MessageService {
	
	private static List<Message> messages=new ArrayList<> ();
	
	public MessageService() {

		messages.add(new Message(1L,"Hello1","Vinu"));
		messages.add(new Message(2L,"Hello2","Ramya"));
	}
	
	public List<Message> getMessages(){
		System.out.println(messages);
		return messages;
	}
	
	public Message getMessage(Long id) {
		
		return messages
				   .stream()
				   .filter(m -> m.getId().equals(id))
				   .findFirst()
				   .orElseThrow(() -> new NotFoundException());
	}
	
	public Message addMessage(Message message) {
		
		message.setId((long) (messages.size()+1));
		message.setCreated(LocalDateTime.now());
		messages.add(message);
		System.out.println(messages);
		return message;
	}
	
	public Message updateMessage(Message message) {
		
		if (messages.stream().anyMatch(m -> m.getId().equals(message.getId()))) {
			
			message.setCreated(LocalDateTime.now());
			messages.set(messages.indexOf(messages.stream()
				   .filter(m -> m.getId().equals(message.getId()))
				   .findFirst().get()),message);
			return message;
						
		} else {
			return null;
		}
	}
	
	public Boolean deleteMessage(Long id) {

		if (messages.stream().anyMatch(m -> m.getId().equals(id))) {
			
			return messages.removeAll(messages.stream()
				   .filter(m -> m.getId().equals(id)).collect(Collectors.toList()));
						
		} else {
			return false;
		}		
	}
}
