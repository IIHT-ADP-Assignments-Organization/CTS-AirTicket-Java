package com.airTicket.dao;

import java.sql.Time;
import java.util.Date;

import com.airTicket.models.Booking;
import com.airTicket.models.Customer;
import com.airTicket.models.FlightDetails;


public interface CustomerServiceDao {
	
	boolean registerCustomer(Customer customer);
	FlightDetails searchFlight(String fromLocation,String toLocation,Date departureDate,Time startTime,int availableSeats);
	boolean ticketBooking(Booking booking);
	boolean editProfile(Customer customer);
	boolean cancelBooking(int bookingId);
}
