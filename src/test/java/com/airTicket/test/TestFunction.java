package com.airTicket.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import java.sql.Time;
import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.airTicket.models.Booking;
import com.airTicket.models.Customer;
import com.airTicket.models.FlightDetails;

import com.airTicket.services.CustomerService;



public class TestFunction {
	
	@Test
	public void testRegister()
	{
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("hotelManagement-application.xml");
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
		boolean customerfromdb =customerservice.registerCustomer(customer);
		assertSame(customer,customerfromdb);
	}
	

	@Test

	public void testSearchFlight() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("hotelManagement-application.xml");	
		FlightDetails flightDetails = new FlightDetails();
		
		CustomerService customerservice=(CustomerService) context.getBean("customerService");
		FlightDetails flightfromdb = customerservice.searchFlight(flightDetails.getFromLocation(),flightDetails.getToLocation(),flightDetails.getDepartureDate(),flightDetails.getStartTime(),flightDetails.getAvailableSeats());
		Assert.assertNotNull(flightfromdb);
		
		
	}	
	
	@Test
	public void testTicketBooking()
	{
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("hotelManagement-application.xml");	Booking booking = new Booking();
	Booking bookings = new Booking();
	bookings.setBookingId(1);
	bookings.setLeavingFrom("bengalore");
	bookings.setGoingTo("delhi");
	bookings.setPassword("john12345678");
	bookings.setAddress("bengalore");
	bookings.setPhoneNumber(1234567891);
	bookings.setNumberOfPassengers(2);
	
	CustomerService customerservice=(CustomerService) context.getBean("customerService");
	boolean isTicketBooked =customerservice.ticketBooking(bookings);
	assertEquals(bookings,isTicketBooked);
	
	}
	
	@Test
	public void testEditProfile()
	{
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("hotelManagement-application.xml");	Booking booking = new Booking();
		Customer customer = new Customer();
		customer.setCustomerId(1);
		customer.setCustomerName("john");
		customer.setEmail("john1234@gmail.com");
		customer.setPassword("john12345678");
		customer.setAddress("bengalore");
		customer.setPhone(1234567891);
		customer.setGender("male");
		customer.setSsnType("non work");
		customer.setSsnNumber(1234356234);
		
		CustomerService customerservice=(CustomerService) context.getBean("customerService");
		boolean isEdited = customerservice.editProfile(customer);
		assertEquals(customer,isEdited);


	}
	
	@Test
	public void testCancelReservation() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("hotelManagement-application.xml");	Booking booking = new Booking();
		
		Booking bookings = new Booking();
		bookings.setBookingId(1);
		
		
		CustomerService customerservice=(CustomerService) context.getBean("customerService");
		boolean bookingCancel = customerservice.cancelBooking(bookings.getBookingId());
		assertEquals(1,bookingCancel);
	}
	
}
