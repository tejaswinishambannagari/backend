package com.exam.backend.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.backend.dto.BookingDTO;
import com.exam.backend.entity.Booking;
import com.exam.backend.repository.BookingRepository;
import com.exam.backend.service.BookingService;





@Service
public class BookingServiceImpl  implements BookingService{

	@Autowired
	private BookingRepository bookingRepository;
	
	@Override
	public BookingDTO addBooking(BookingDTO bookingDto) {
		// TODO Auto-generated method stub
		
		Booking booking = new Booking();
		BeanUtils.copyProperties(bookingDto, booking);
		Booking bookingSave=bookingRepository.save(booking);
		bookingDto.setId(bookingSave.getId());
		booking.setExamid(bookingDto.getExamid());
		booking.setCandidateid(bookingDto.getCandidateid());
		booking.setBookingdate(bookingDto.getBookingdate());
		return bookingDto;
//		Booking booking = new Booking();
//		booking.setBookingid(bookingDto.getBookingid());
//		booking.setExamid(bookingDto.getExamid());
//		booking.setCandidateid(bookingDto.getCandidateid());
//		booking.setBookingdate(bookingDto.getBookingdate());
//		Booking bookingsave =bookingRepository.save(booking);
//		bookingDto.setBookingid(bookingsave.getBookingid());
//	
//		return bookingDto;
		
		
	}

	@Override
	public BookingDTO updateBooking(BookingDTO bookingDTO,int id) {
		// TODO Auto-generated method stub
       
		
        Booking booking = new Booking();
		booking.setId(bookingDTO.getId());
		booking.setExamid(bookingDTO.getExamid());
		booking.setCandidateid(bookingDTO.getCandidateid());
		booking.setBookingdate(bookingDTO.getBookingdate());	
		Booking saveId=bookingRepository.save(booking);
		bookingDTO.setId(saveId.getId());
		
		return bookingDTO;
	}

	@Override
	public boolean deleteBooking(BookingDTO bookingDTO) {
		// TODO Auto-generated method stub
		Booking booking = new Booking();
		booking.setId(bookingDTO.getId());
		bookingRepository.delete(booking);
		return true;
	}

	@Override
	public BookingDTO getBookingById(int id) {
		// TODO Auto-generated method stub
		Optional<Booking> booking = bookingRepository.findById(id);
		if (booking.isPresent()) {
			BookingDTO dto = new BookingDTO();
			BeanUtils.copyProperties(booking.get(), dto);
			return dto;
		}
		return null;
	}

	@Override
	public List<BookingDTO> findAll() {
		// TODO Auto-generated method stub
		Iterable<Booking> booking = bookingRepository.findAll();
		List<BookingDTO> dtos = new ArrayList<>();
		for (Booking bookings : booking) {
			BookingDTO dto = new BookingDTO();
			BeanUtils.copyProperties(bookings, dto);
			dtos.add(dto);
		}
		return dtos;
	}

}