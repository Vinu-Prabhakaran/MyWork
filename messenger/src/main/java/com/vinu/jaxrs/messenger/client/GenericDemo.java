/**
 * 
 */
package com.vinu.jaxrs.messenger.client;

import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;

import com.vinu.jaxrs.messenger.model.Message;

/**
 * @author Vinu Prabhakaran
 *         on Oct 14, 2020
 *
 */
public class GenericDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Client client=ClientBuilder.newClient();
		
		Response response = client.target("http://localhost:8080/messenger/webapi/")
		  .path("messages")
		  .queryParam("year", 2018)
		  .request()
		  .buildGet()
		  .invoke();
		
		List<Message> msgList = response.readEntity(new GenericType<List<Message>>() {});
		msgList.stream().forEach(System.out::println);

	}

}
