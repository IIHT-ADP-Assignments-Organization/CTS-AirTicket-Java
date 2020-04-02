package com.airTicket.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.airTicket.models.Booking;
import com.airTicket.models.Customer;



public class TestBoundary {
	
	 @Test
	    public void testNumberOfSeatsBookingLessThan20()
	    {
			Booking bookings = new Booking();
			
			bookings.setNumberOfPassengers(22);
	     
	     boolean requiredNoOfPassengers=(bookings.getNumberOfPassengers()<=20);
	     assertEquals( requiredNoOfPassengers,bookings.getNumberOfPassengers());
	    }

	 @Test
	    public void testAddressLength()
	    {
			Customer customer = new Customer();
			customer.setCustomerId(1);
			customer.setCustomerName("john");
			customer.setEmail("john@gmail.com");
			customer.setPassword("john12345678");
			customer.setAddress("bengalore");
			customer.setPhone(1234567891);
			customer.setGender("male");
			customer.setSsnType("non work");
			customer.setSsnNumber(1234356234);
	        		
			int minChar=100;
	        boolean addressLength=(customer.getAddress().length()<=minChar);
	        assertEquals( addressLength,customer.getAddress());

	    }
	 @Test
	    public void testPhoneNumberLength()
	    {
		 Customer customer = new Customer();
			customer.setCustomerId(1);
			customer.setCustomerName("john");
			customer.setEmail("john@gmail.com");
			customer.setPassword("john12345678");
			customer.setAddress("bengalore");
			customer.setPhone(1234567891);
			customer.setGender("male");
			customer.setSsnType("non work");
			customer.setSsnNumber(1234356234);
	        long contactNumberLength=10;
	        
	    assertEquals( contactNumberLength,customer.getPhone());


	    }
	 
	 @Test
	    public void testpasswordLength()
	    {
		 Customer customer = new Customer();
			customer.setCustomerId(1);
			customer.setCustomerName("john");
			customer.setEmail("john@gmail.com");
			customer.setPassword("john12345678");
			customer.setAddress("bengalore");
			customer.setPhone(1234567891);
			customer.setGender("male");
			customer.setSsnType("non work");
			customer.setSsnNumber(1234356234);
	        		
	        int passwordLength=10;
	assertEquals(passwordLength,customer.getPassword().length());


	    }
	 
	 @Test
	    public void testEmailLength()
	    {
		 Customer customer = new Customer();
			customer.setCustomerId(1);
			customer.setCustomerName("john");
			customer.setEmail("john@gmail.com");
			customer.setPassword("john12345678");
			customer.setAddress("bengalore");
			customer.setPhone(1234567891);
			customer.setGender("male");
			customer.setSsnType("non work");
			customer.setSsnNumber(1234356234);
	        		
	        int emailLength=10;
	assertEquals(emailLength,customer.getPassword().length());


	    }
}
