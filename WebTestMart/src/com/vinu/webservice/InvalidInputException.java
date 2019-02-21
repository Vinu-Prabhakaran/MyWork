package com.vinu.webservice;

@SuppressWarnings("serial")
public class InvalidInputException extends Exception {
	
	private String errorDetails;
	//private String reason;
	
	public InvalidInputException(String reason,String errorDetails) {
		super(reason);
		this.errorDetails=errorDetails;
	}
	
	public String getErrorDetails() {
		return errorDetails;
	}

}
