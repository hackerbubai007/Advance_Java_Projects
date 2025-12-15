package com.kodewala.order_service.exception.handler;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.kodewala.order_service.exception.response.ErrorResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(InvalidIdException.class)
	public ResponseEntity<ErrorResponse> handleException(InvalidIdException exception){
		
		ErrorResponse errorResponse= new ErrorResponse();
		
		errorResponse.setErrorCode("ORD-404");
		errorResponse.setErrorMsg(exception.getMessage());
		
		return ResponseEntity.ok(errorResponse);
		
	}
	

}
