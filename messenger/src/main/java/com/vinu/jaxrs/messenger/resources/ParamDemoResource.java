/**
 * 
 */
package com.vinu.jaxrs.messenger.resources;



import javax.inject.Singleton;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author Vinu Prabhakaran
 *         on Jul 12, 2020
 *
 */
@Path("/paramdemo")
@Consumes(MediaType.TEXT_PLAIN)
@Produces(MediaType.TEXT_PLAIN)
@Singleton
public class ParamDemoResource {
		
	@GET
	@Path("/matrixparm")
	public String demoMarixParam(@MatrixParam("matrixParam") String matrixParam) {
		
		return String.format("MartrixParam: %s",matrixParam); 
	}
	
	@GET
	@Path("/headerparm")
	public String demoHeaderParam(@HeaderParam("headerParam") String headerParam) {
		
		return String.format("HeaderParam: %s",headerParam); 
	}
	
}
