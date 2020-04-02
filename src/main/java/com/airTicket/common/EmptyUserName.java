package com.airTicket.common;

public class EmptyUserName extends Exception {

	public static  String message="Please fill the name";


	public EmptyUserName()
	{
		
	}
	public EmptyUserName(String message)
	{
		this.message=message;
	}
	
}
