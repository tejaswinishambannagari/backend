package com.exam.backend.BookingController;

//import java.util.List;
//
//import javax.validation.Valid;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.exam.backend.dto.BookingDTO;
//import com.exam.backend.exception.BookingNotFoundException;
//import com.exam.backend.service.BookingService;
//
//public class ExamController {
//	@RestController
//	@RequestMapping("/api")
//	public class BookingController {
//		@Autowired
//		public BookingService bookingService;
//
//		//http://localhost:9091/api/bookings
//		@PostMapping("/bookings")
//		public ResponseEntity<BookingDTO> addBooking(@Valid @RequestBody BookingDTO booking) {
//
//			BookingDTO savebooking = bookingService.addBooking(booking);
//			return ResponseEntity.ok(savebooking);
//
//		}
//
//
//		@PutMapping("/bookings/{id}")
//		public ResponseEntity<BookingDTO> updateBooking( @PathVariable int id, @RequestBody BookingDTO bookingDTO) {
//			return new ResponseEntity<BookingDTO>(bookingService.updateBooking(bookingDTO, id), HttpStatus.OK);
//
//		}
//		
//		
//		
//		@GetMapping("/bookings/{id}")
//		public ResponseEntity<BookingDTO> getBookingById( @PathVariable int id) {
//			BookingDTO bookingDTO = bookingService.getBookingById(id);
//			return new ResponseEntity<BookingDTO>(bookingDTO, HttpStatus.OK);
//		}
//
//		@DeleteMapping("/bookings/{id}")
//		public ResponseEntity<?> deleteBookingById( @PathVariable int id) {
//			BookingDTO bookingDTO = bookingService.getBookingById(id);
//			if (bookingDTO != null) {
//				bookingService.deleteBooking(bookingDTO);
//				return new ResponseEntity<Boolean>(true, HttpStatus.ACCEPTED);
//				}
//			throw new BookingNotFoundException("Booking of Exam is not available");
//		}
//		
//
//		@GetMapping("/bookings")
//		public ResponseEntity<List<BookingDTO>> getAllBooking() {
//			List<BookingDTO> list = bookingService.findAll();
//			return ResponseEntity.ok(list);
//			}
//		
//	}
//}
