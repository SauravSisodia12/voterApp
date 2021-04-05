package com.voterapp.service;

import com.voterapp.exception.InvalidVoterException;
import com.voterapp.exception.LocalityNotFoundException;
import com.voterapp.exception.NoVoterIdException;
import com.voterapp.exception.UnderAgeException;

public class ElectionBoothImpl implements ElectionBooth {

	String [] localities = {"Shahdara","VasantKunj","Okhla","Karkardooma"}; 
	
	private boolean checkAge(int age) throws UnderAgeException {
		if(age<18)
			throw new UnderAgeException("Age is less than 18");
		return true;
	}
	
	private boolean checkLocality(String locality) throws LocalityNotFoundException {
		for (String val : localities ) {
			if(val.equalsIgnoreCase(locality))
				return true;
			break;
			}
		throw new LocalityNotFoundException("Locality is INVALID");
	}

	private boolean checkVoterId(int vid) throws NoVoterIdException {
		if(vid>=1000&&vid<=9999)
			return true;
		throw new NoVoterIdException("Invalid VoterId");
	}
	
	@Override
	public boolean checkElegibility(int age, String locality, int vid)
			throws InvalidVoterException {
		
		boolean statusOfAge = checkAge(age);
		boolean statusOfLocality = checkLocality(locality);
		boolean statusOfVoterId = checkVoterId(vid);
		
		if(!statusOfAge)
			throw new UnderAgeException("Age is less than 18");
		else if(!statusOfLocality)
			throw new LocalityNotFoundException("Locality is INVALID");
		else if(!statusOfVoterId)
			throw new NoVoterIdException("Invalid VoterId");
		return true;
	}
}
