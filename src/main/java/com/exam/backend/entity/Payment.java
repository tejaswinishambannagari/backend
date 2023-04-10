package com.exam.backend.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Payment")
public class Payment {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int paymentid;
	private int bookingid;
	private String paymentdate;
	
	
	public int getPaymentid() {
		return paymentid;
	}
	public void setPaymentid(int paymentid) {
		this.paymentid = paymentid;
	}
	public int getBookingid() {
		return bookingid;
	}
	public void setBookingid(int bookingid) {
		this.bookingid = bookingid;
	}
	public String getPaymentdate() {
		return paymentdate;
	}
	public void setPaymentdate(String paymentdate) {
		this.paymentdate = paymentdate;
	}
	public Payment() {
		super();
		this.paymentid = paymentid;
		this.bookingid = bookingid;
		this.paymentdate = paymentdate;
	}
	@Override
	public String toString() {
		return "Payment [paymentid=" + paymentid + ", bookingid=" + bookingid + ", paymentdate=" + paymentdate + "]";
	}
	
	

}