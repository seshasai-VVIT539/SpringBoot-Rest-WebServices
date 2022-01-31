package com.in28minutes.rest.webservices.restfulwebservices.Exception;

import java.util.Date;
/**
 * This is the structure of a custom response to a request
 * @author Seshu
 *
 */
public class ExceptionResponse {
	private Date timestamp;
	private String message;
	private String details;

	public ExceptionResponse(Date timestamp, String message, String details) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.details = details;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public String getMessage() {
		return message;
	}

	public String getDetails() {
		return details;
	}

}