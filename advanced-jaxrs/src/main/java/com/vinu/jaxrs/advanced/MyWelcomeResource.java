/**
 * 
 */
package com.vinu.jaxrs.advanced;

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
public class MyWelcomeResource {
	
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String myHelloMessage() {
		return "Hello...this works!!!";
	}
}
