package com.voterapp.exception;

public class UnderAgeException extends InvalidVoterException{

public UnderAgeException() {
		
	}
	public UnderAgeException(String message) {
		super(message);
	}
}
