package com.kodewala.invoice_generation.exception;

import java.util.NoSuchElementException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.kodewala.invoice_generation.response.ErrorResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(NoSuchElementException.class)
	public ResponseEntity<ErrorResponse> handleException(){
		
		ErrorResponse errorResponse= new ErrorResponse();
		
		errorResponse.setErrorCode("NSE-007");
		errorResponse.setErrorMsg("Invoice Not found for this ID");
		
		return ResponseEntity.ok(errorResponse);
		
	}

}
