package com.airTicket.models;

import java.util.Date;

public class Customer {
	
	int customerId;
	String customerName;
	String email;
	String password;
	Date dob;
	String address;
	long phone;
	String gender;
	String ssnType;
	int ssnNumber;
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getSsnType() {
		return ssnType;
	}
	public void setSsnType(String ssnType) {
		this.ssnType = ssnType;
	}
	public int getSsnNumber() {
		return ssnNumber;
	}
	public void setSsnNumber(int ssnNumber) {
		this.ssnNumber = ssnNumber;
	}

	
}
