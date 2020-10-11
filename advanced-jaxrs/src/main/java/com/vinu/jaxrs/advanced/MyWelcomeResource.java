/**
 * 
 */
package com.vinu.jaxrs.advanced;

import java.time.LocalDate;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author Vinu Prabhakaran
 *         on Aug 1, 2020
 *
 */
@Path("/welcome")
@Singleton
public class MyWelcomeResource {
	
	private int count;
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String myHelloMessage() {
		return "Hello...this works!!!Attempt#"+ ++count;
	}
	
	@GET
	@Path("/getdate")
	@Produces(MediaType.TEXT_PLAIN)
	public LocalDate testMessageBodyWriter() {
		return LocalDate.now();
	}
}
