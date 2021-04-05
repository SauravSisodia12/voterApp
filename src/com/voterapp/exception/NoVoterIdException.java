package com.voterapp.exception;

public class NoVoterIdException extends InvalidVoterException{

public NoVoterIdException() {
		
	}
	public NoVoterIdException(String message) {
		super(message);
	}
}
