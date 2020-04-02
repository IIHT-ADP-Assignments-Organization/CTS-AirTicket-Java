package com.airTicket.common;

public class FlightDoesNotExistException extends Exception {
	
	public static  String message="user already exists !..please login";


	public FlightDoesNotExistException()
	{
		
	}
	public FlightDoesNotExistException(String message)
	{
		this.message=message;
	}

}
