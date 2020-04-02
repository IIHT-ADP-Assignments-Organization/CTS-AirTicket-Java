package com.airTicket.common;

public class EmptyPassword extends Exception {

	public static  String message="Please fill the Password";


	public EmptyPassword()
	{
		
	}
	public EmptyPassword(String message)
	{
		this.message=message;
	}
	
}