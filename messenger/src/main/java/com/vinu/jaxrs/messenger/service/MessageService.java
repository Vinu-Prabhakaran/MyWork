/**
 * 
 */
package com.vinu.jaxrs.messenger.service;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.inject.Singleton;

import com.vinu.jaxrs.messenger.exceptions.DataNotFoundException;
import com.vinu.jaxrs.messenger.model.Comment;
import com.vinu.jaxrs.messenger.model.Message;

/**
 * @author Vinu Prabhakaran
 *         on Jun 30, 2020
 *
 */
@Singleton
public class MessageService {
	
	private static List<Message> messages=new ArrayList<> ();
	
	public MessageService() {

		messages.add(new Message(1L,"Hello1","Vinu"));
		messages.add(new Message(2L,"Hello2","Ramya"));
		messages.add(new Message(3L,"Hello2",LocalDateTime.of(2018, Month.APRIL, 11,10,11),"Vinu", new ArrayList<Comment>()));
		messages.add(new Message(4L,"Hello3",LocalDateTime.of(2018, Month.JUNE, 11,10,11),"Vinu", new ArrayList<Comment>()));
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
				   .orElseThrow(() -> new DataNotFoundException("Message with id "+id+" not found"));
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
	
	
	public List<Message> getMessagesByYear(Integer year){
		
		return messages.stream()
					   .filter(m -> m.getCreated().getYear() == year)
					   .collect(Collectors.toList());
	}
	
	public List<Message> getMessagesPaginated(Integer start,Integer size){
		
		return start+size > messages.size() ? new ArrayList<Message>():messages.subList(start, start+size);
	}
}
