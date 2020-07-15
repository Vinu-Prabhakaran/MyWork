/**
 * 
 */
package com.vinu.jaxrs.messenger.exceptions;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.vinu.jaxrs.messenger.model.ErrorMessage;

/**
 * @author Vinu Prabhakaran
 *         on Jul 13, 2020
 *
 */
@Provider
public class GeneralExceptionMapper implements ExceptionMapper<Throwable>{

	@Override
	public Response toResponse(Throwable ex) {
		
		Response errorResponse=Response.status(Status.INTERNAL_SERVER_ERROR)
							           .entity(new ErrorMessage("500",ex.getMessage()))
							           .build();
		return errorResponse;
		
	}

}
