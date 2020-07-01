/**
 * 
 */
package com.vinu.jaxrs.messenger.service;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

import com.vinu.jaxrs.messenger.model.Message;

/**
 * @author Vinu Prabhakaran
 *         on Jun 30, 2020
 *
 */
public class MessageService {
	
	private List<Message> messages=Arrays.asList(new Message(1234l,"Hello1",LocalDateTime.of(2016, Month.JULY, 13, 11, 23),"Vinu"));
	
	public List<Message> getMessages(){
		System.out.println(messages);
		return this.messages;
	}
}
