package com.voterapp.service;

import com.voterapp.exception.InvalidVoterException;
import com.voterapp.exception.LocalityNotFoundException;
import com.voterapp.exception.NoVoterIdException;
import com.voterapp.exception.UnderAgeException;

public interface ElectionBooth {
	boolean checkElegibility(int age, String locality, int vid) throws InvalidVoterException, LocalityNotFoundException, UnderAgeException, NoVoterIdException;
	
}
