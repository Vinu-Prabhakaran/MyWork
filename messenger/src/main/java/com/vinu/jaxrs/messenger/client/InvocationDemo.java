/**
 * 
 */
package com.vinu.jaxrs.messenger.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.core.Response;

/**
 * @author Vinu Prabhakaran
 *         on Oct 14, 2020
 *
 */
public class InvocationDemo {

	public static void main(String[] args) {
		
		InvocationDemo demo=new InvocationDemo();
		Invocation requestForMessagesByYear = demo.prepareRequestForMessagesByYear(2018);
		Response response = requestForMessagesByYear.invoke();
		System.out.println("Status:"+response.getStatus()+"\n ResponseBody:"+response.readEntity(String.class));
	}
	
	public Invocation prepareRequestForMessagesByYear(Integer year) {
		
		Client client=ClientBuilder.newClient();
		
		return client.target("http://localhost:8080/messenger/webapi/")
			  .path("messages")
			  .queryParam("year", year)
			  .request()
			  .buildGet();
	}

}
