package com.kodewala.zepto.exception;

import org.hibernate.exception.ConstraintViolationException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.kodewala.zepto.error_response.ErrorResponse;

@RestControllerAdvice
public class ZeptoExceptionHandler {

	@ExceptionHandler(ConstraintViolationException.class)
	public ResponseEntity<ErrorResponse> handleEmailAlreadyExsistsException(ConstraintViolationException ex) {

		ErrorResponse errorResponse = new ErrorResponse();

		errorResponse.setErrorCode("EAEE-007");
		errorResponse.setErrorMessage("email already exists.. try another email..");

		return ResponseEntity.ok(errorResponse);

	}

	@ExceptionHandler(PreviousPasswordException.class)
	public ResponseEntity<ErrorResponse> handlePreviousPasswordException(PreviousPasswordException ex) {

		ErrorResponse errorResponse = new ErrorResponse();

		errorResponse.setErrorCode("PPWE-008");
		errorResponse.setErrorMessage(ex.getMessage());
		return ResponseEntity.ok(errorResponse);

	}
	
	@ExceptionHandler(PasswordNotFountException.class)
	public ResponseEntity<ErrorResponse> passwordLogNotFound(PasswordNotFountException ex){
		
		ErrorResponse errorResponse= new ErrorResponse();
		
		errorResponse.setErrorCode("PNFE-009");
		errorResponse.setErrorCode(ex.getMessage());
		return ResponseEntity.ok(errorResponse);
	}
	
	@ExceptionHandler(ErrorWhileUpdatingPassword.class)
	public ResponseEntity<ErrorResponse> passwordLogNotFound(ErrorWhileUpdatingPassword ex){
		
		ErrorResponse errorResponse= new ErrorResponse();
		
		errorResponse.setErrorCode("EWUP-006");
		errorResponse.setErrorCode(ex.getMessage());
		return ResponseEntity.ok(errorResponse);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
