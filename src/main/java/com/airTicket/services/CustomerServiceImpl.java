package com.airTicket.services;

import java.sql.Time;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.airTicket.dao.CustomerServiceDao;
import com.airTicket.models.Booking;
import com.airTicket.models.Customer;
import com.airTicket.models.FlightDetails;


@Component
@Service ("customerService")
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerServiceDao customerServiceDao;
	@Transactional
	public boolean registerCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Transactional
	public FlightDetails searchFlight(String fromLocation, String toLocation, Date departureDate, Time startTime,
			int availableSeats) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public boolean ticketBooking(Booking booking) {
		// TODO Auto-generated method stub
		return false;
	}

	@Transactional
	public boolean editProfile(Customer customer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Transactional
	public boolean cancelBooking(int bookingId) {
		// TODO Auto-generated method stub
		return false;
	}

	

}
