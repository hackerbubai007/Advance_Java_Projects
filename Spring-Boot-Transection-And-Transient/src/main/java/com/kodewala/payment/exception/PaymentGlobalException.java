package com.kodewala.payment.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.kodewala.payment.response.ErrorResponse;

@RestControllerAdvice
public class PaymentGlobalException {

	@ExceptionHandler(AccountNotFound.class)
	public ResponseEntity<ErrorResponse> accountNotFoundHandler(AccountNotFound e) {

		ErrorResponse errorResponse = new ErrorResponse();

		errorResponse.setErrorCode("ANNF-007");
		errorResponse.setErrorMsg(e.getMessage());

		return ResponseEntity.ok(errorResponse);
	}

	@ExceptionHandler(InsufficientBalance.class)
	public ResponseEntity<ErrorResponse> accountNotFoundHandler(InsufficientBalance e) {

		ErrorResponse errorResponse = new ErrorResponse();

		errorResponse.setErrorCode("ISB-009");
		errorResponse.setErrorMsg(e.getMessage());

		return ResponseEntity.ok(errorResponse);

	}

	@ExceptionHandler(DeActivateException.class)
	public ResponseEntity<ErrorResponse> accountNotFoundHandler(DeActivateException e) {

		ErrorResponse errorResponse = new ErrorResponse();

		errorResponse.setErrorCode("DATV-005");
		errorResponse.setErrorMsg(e.getMessage());

		return ResponseEntity.ok(errorResponse);

	}

}
