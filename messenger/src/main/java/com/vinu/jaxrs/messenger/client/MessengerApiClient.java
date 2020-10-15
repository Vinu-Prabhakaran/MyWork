/**
 * 
 */
package com.vinu.jaxrs.messenger.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import com.vinu.jaxrs.messenger.model.Message;

/**
 * @author Vinu Prabhakaran
 *         on Oct 11, 2020
 *
 */
public class MessengerApiClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Client client=ClientBuilder.newClient();
		WebTarget baseTarget = client
								.target("http://localhost:8080/messenger/webapi/");
		WebTarget messageTarget = baseTarget.path("messages/");
		WebTarget singleMessageTarget = messageTarget.path("{messageId}");
		
		Message message = singleMessageTarget
					.resolveTemplate("messageId", "1")
					.request()
					.get(Message.class);
		/*Response response = client
			.target("http://localhost:8080/messenger/webapi/messages/1")
			.request()
			.get();
		Message message=response
							.readEntity(Message.class);*/  //Unwraps the response entity.
		System.out.println(message);
		//POST Request
		Message newMessage=new Message(5L, "New Message from API Client", "vprabha");
		
		Response postResponse = messageTarget.request().post(Entity.json(newMessage));
		System.out.println("POST Status :"+postResponse.getStatus()+"\n ResponseBody ;"+postResponse.readEntity(Message.class));
		
		//PUT Request
		Message updatedMessage=new Message(1L, "Update Message from API Client", "vprabha");
		Response putResponse=singleMessageTarget.resolveTemplate("messageId", "1")
											   .request()
											   .put(Entity.json(updatedMessage));
		System.out.println("PUT Status :"+putResponse.getStatus()+"\n ResponseBody ;"+putResponse.readEntity(String.class));
				

	}

}
