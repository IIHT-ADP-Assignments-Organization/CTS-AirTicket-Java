package com.airTicket.common;

public class EmptyEmail extends Exception{
	
	public static  String message="Please fill the Email";


	public EmptyEmail()
	{
		
	}
	public EmptyEmail(String message)
	{
		this.message=message;
	}

}
