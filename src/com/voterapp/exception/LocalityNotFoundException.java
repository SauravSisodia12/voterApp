package com.voterapp.exception;

public class LocalityNotFoundException extends InvalidVoterException {

	public LocalityNotFoundException() {
		
	}
	public LocalityNotFoundException(String message) {
		super(message);
	}
}
