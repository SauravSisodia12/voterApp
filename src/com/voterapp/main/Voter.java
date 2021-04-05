package com.voterapp.main;

import java.util.Scanner;
import com.voterapp.exception.InvalidVoterException;
import com.voterapp.exception.LocalityNotFoundException;
import com.voterapp.exception.NoVoterIdException;
import com.voterapp.exception.UnderAgeException;
import com.voterapp.service.ElectionBoothImpl;

public class Voter {

	public static void main(String[] args) {
		try 
		{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Details");
		System.out.print("Enter your age = ");
		int age = sc.nextInt();
		System.out.print("Enter your locality = ");
		String locality = sc.next();
		System.out.print("Enter your Voterid no = ");
		int vid = sc.nextInt();
		ElectionBoothImpl eb = new ElectionBoothImpl();
		boolean status = eb.checkElegibility(age, locality, vid);
		if(status) {
			System.out.println("Valid Voter");
		}
		sc.close();
		} catch(InvalidVoterException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
