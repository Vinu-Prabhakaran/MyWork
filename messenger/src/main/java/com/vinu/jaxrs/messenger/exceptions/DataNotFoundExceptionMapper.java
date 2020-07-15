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
public class DataNotFoundExceptionMapper implements ExceptionMapper<DataNotFoundException>{

	@Override
	public Response toResponse(DataNotFoundException ex) {
		
		Response errorResponse=Response.status(Status.NOT_FOUND)
							           .entity(new ErrorMessage("404",ex.getMessage()))
							           .build();
		return errorResponse;
		
	}

}
