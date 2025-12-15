package com.kodewala.zepto.error_response;

public class ErrorResponse {

	private String errorCode;

	private String errorMessage;

	public String getErrorCode(String errorCode) {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage(String errorMessage) {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

}
