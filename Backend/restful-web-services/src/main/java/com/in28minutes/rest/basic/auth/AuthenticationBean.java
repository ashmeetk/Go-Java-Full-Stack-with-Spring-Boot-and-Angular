package com.in28minutes.rest.basic.auth;

public class AuthenticationBean {
	private String message;

	@Override
	public String toString() {
		return "AuthenticationBean [message=" + message + "]";
	}

	public AuthenticationBean(String message) {
		super();
		this.message = message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
	
	

}
