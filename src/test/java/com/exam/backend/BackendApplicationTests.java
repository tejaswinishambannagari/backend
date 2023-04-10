package com.exam.backend;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;


import com.exam.backend.dto.BookingDTO;
import com.exam.backend.repository.BookingRepository;
import com.exam.backend.serviceImpl.BookingServiceImpl;

public class BackendApplicationTests {


   @Mock
private BookingRepository bookingRepository;

 @InjectMocks
private BookingServiceImpl bookingservice;

   @ExtendWith
   (MockitoExtension.class)
   
         

@Test
public void testAddBooking() throws Exception{
BookingDTO booking = new BookingDTO();
booking.setId(1);
booking.setExamid(2);
booking.setCandidateid(3);
booking.setBookingdate("2023-04-01");
when(bookingRepository.save(booking)).thenReturn(booking);
BookingDTO saveBooking = bookingservice.addBooking(booking);

assertNotNull(saveBooking);
assertEquals("booking",saveBooking.getBookingdate());

}



//@SpringBootTest
//class BackendApplicationTests {
//
//	@Test
//	void contextLoads() {
//}
//
//}



@Test
public void testUpdateBooking() throws Exception
{
	BookingDTO booking = new BookingDTO();
	booking.setId(1);
    booking.setExamid(2);
	booking.setCandidateid(3);
	booking.setBookingdate("2023-04-01");

when(bookingRepository.findById(1)).thenReturn(Optional.of(booking));
when(bookingRepository.save(booking)).thenReturn(booking);
BookingDTO updatedBooking = bookingservice.updateBooking(booking);
assertNotNull(updatedBooking);
}

  @Test
public void testGetAllPlaucards(){
BookingDTO booking = new BookingDTO();
booking.setId(1);
booking.setExamid(2);
booking.setCandidateid(3);
booking.setBookingdate("2023-04-01");

BookingDTO booking1 = new BookingDTO();
booking1.setId(1);
booking1.setExamid(2);
booking1.setCandidateid(3);
booking1.setBookingdate("2023-04-01");

 List<BookingDTO> bookingList = new ArrayList<BookingDTO>();
 bookingList.add(booking1);
 bookingList.add(booking);

when(bookingRepository.findAll()).thenReturn(bookingList);
List<BookingDTO> foundPlaycardList = bookingservice.getAllBookings();
assertNotNull(foundPlaycardList);
assertEquals(2,foundPlaycardList.size());
}

@Test
public void testDeleteBooking() throws Exception
{
	BookingDTO booking = new BookingDTO();
	booking.setBookingid(1);
	booking.setExamid(2);
	booking.setCandidateid(3);
	booking.setBookingdate("2023-04-01");

when(bookingRepository.findById(1)).thenReturn(Optional.of(booking));
when(bookingRepository.save(booking)).thenReturn(booking);

BookingDTO deleteBooking = bookingservice.deleteBooking(1);
assertNotNull(deleteBooking);
assertEquals("TestBooking",deleteBooking.getBookingdate());
}
}

