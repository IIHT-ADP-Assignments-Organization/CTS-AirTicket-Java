package com.airTicket.models;

import java.sql.Time;
import java.util.Date;

public class Invoice {
	
	int invoiceId;
	String customerName;
	int bookingId;
	String airlineName;
	String leavingFrom;
	String goingTo;
	int numberOfPassegers;
	Date dateOfJourney;
	Time departure;
	Date bookingDate;
	int totalPrice;
	
	public int getInvoiceId() {
		return invoiceId;
	}
	public void setInvoiceId(int invoiceId) {
		this.invoiceId = invoiceId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public String getAirlineName() {
		return airlineName;
	}
	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}
	public String getLeavingFrom() {
		return leavingFrom;
	}
	public void setLeavingFrom(String leavingFrom) {
		this.leavingFrom = leavingFrom;
	}
	public String getGoingTo() {
		return goingTo;
	}
	public void setGoingTo(String goingTo) {
		this.goingTo = goingTo;
	}
	public int getNumberOfPassegers() {
		return numberOfPassegers;
	}
	public void setNumberOfPassegers(int numberOfPassegers) {
		this.numberOfPassegers = numberOfPassegers;
	}
	public Date getDateOfJourney() {
		return dateOfJourney;
	}
	public void setDateOfJourney(Date dateOfJourney) {
		this.dateOfJourney = dateOfJourney;
	}
	public Time getDeparture() {
		return departure;
	}
	public void setDeparture(Time departure) {
		this.departure = departure;
	}
	public Date getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}
	public int getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	

}
