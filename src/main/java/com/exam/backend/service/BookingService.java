package com.exam.backend.service;

import java.util.List;

import javax.validation.Valid;

import com.exam.backend.dto.BookingDTO;
import com.exam.backend.entity.Booking;



public interface BookingService {
public BookingDTO addBooking(BookingDTO booking);
	
	public BookingDTO updateBooking(BookingDTO bookingDTO, int id);
	
	public boolean deleteBooking(BookingDTO bookingDTO);
	
	public BookingDTO getBookingById( int id);
	
	public List<BookingDTO> findAll();

}
