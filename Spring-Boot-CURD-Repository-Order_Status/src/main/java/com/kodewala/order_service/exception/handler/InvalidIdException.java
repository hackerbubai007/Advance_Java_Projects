package com.kodewala.order_service.exception.handler;

public class InvalidIdException extends RuntimeException {
	
	public InvalidIdException(String _msg) {
		super(_msg);
	}

}
