package com.airTicket.test;

import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.airTicket.common.EmptyEmail;
import com.airTicket.common.EmptyPassword;
import com.airTicket.common.EmptyUserName;
import com.airTicket.common.FlightDoesNotExistException;
import com.airTicket.common.UserAlreadyExistException;
import com.airTicket.models.Customer;
import com.airTicket.models.FlightDetails;
import com.airTicket.models.SearchDetails;
import com.airTicket.services.CustomerService;


import junit.framework.Assert;

public class TestException {
	
	@Test
    public void testForUserRegistration() throws UserAlreadyExistException 
    {
	 ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("couponbank-application.xml");
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
		
		
		CustomerService customerservice=(CustomerService) context.getBean("customerService");
		customerservice.registerCustomer(customer);
Assert.assertEquals(UserAlreadyExistException.message," user already exists !..please login");
    }

	@Test
    public void testForUserLogin() throws FlightDoesNotExistException  
    {
		
	 ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("couponbank-application.xml");
		FlightDetails flightDetails = new FlightDetails();
		SearchDetails searchDetails = new SearchDetails();
		
		searchDetails.setLeavingFrom("bengalore");
		searchDetails.setGoingTo("delhi");
		searchDetails.setSeatToBook(2);
		CustomerService customerservice=(CustomerService) context.getBean("customerService");
		customerservice.searchFlight(searchDetails);
Assert.assertEquals(FlightDoesNotExistException.message," user does not exist");
    
	
	 }
	
	@Test
    public void testForEmptyUserName() throws EmptyUserName 
    {
	 ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("couponbank-application.xml");
	 Customer customer = new Customer();
		customer.setCustomerId(1);
		customer.setCustomerName("john");
		CustomerService customerservice=(CustomerService) context.getBean("customerService");
		customerservice.registerCustomer(customer);
Assert.assertEquals(EmptyUserName.message," please fill the user name");
    }

	@Test
    public void testForEmptyPassword() throws EmptyPassword 
    {
	 ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("couponbank-application.xml");
	 Customer customer = new Customer();
		customer.setCustomerId(1);
		customer.setCustomerName("john");
		customer.setPassword("john12345678");
		CustomerService customerservice=(CustomerService) context.getBean("customerService");
		customerservice.registerCustomer(customer);
Assert.assertEquals(EmptyPassword.message," please fill the password");
    }

	@Test
    public void testForEmptyEmail() throws EmptyEmail 
    {
	 ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("couponbank-application.xml");
	 Customer customer = new Customer();
		customer.setCustomerId(1);
		customer.setCustomerName("john");
		customer.setEmail("john@gmail.com");
		customer.setPassword("john12345678");
		CustomerService customerservice=(CustomerService) context.getBean("customerService");
		customerservice.registerCustomer(customer);
Assert.assertEquals(EmptyEmail.message," please fill the email");
    }
	
}
