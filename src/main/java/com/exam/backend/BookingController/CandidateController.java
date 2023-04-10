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
//import com.exam.backend.dto.CandidateDTO;
//import com.exam.backend.service.CandidateService;
//


public class CandidateController {
//	@RestController
//	@RequestMapping("/api")
//	public class BookingController {
//		@Autowired
//		public CandidateService candidateService;
//
//		//http://localhost:9091/api/bookings
//		@PostMapping("/candidate")
//		public ResponseEntity<CandidateDTO> addBooking(@Valid @RequestBody CandidateDTO booking) {
//
//			CandidateDTO savecandidate = candidateService.addCandidate(booking);
//			return ResponseEntity.ok(savecandidate);
//
//		}
//
//
//		@PutMapping("/bookings/{id}")
//		public ResponseEntity<CandidateDTO> updateCandidate( @PathVariable int id, @RequestBody CandidateDTO candidateDTO) {
//			return new ResponseEntity<CandidateDTO>(candidateService.updateCandidate(candidateDTO, id), HttpStatus.OK);
//
//		}
//		
//		
//		
//		@GetMapping("/bookings/{id}")
//		public ResponseEntity<CandidateDTO> getBookingById( @PathVariable int id) {
//			CandidateDTO candidateDTO = candidateService.getCandidateById(id);
//			return new ResponseEntity<CandidateDTO>(candidateDTO, HttpStatus.OK);
//		}
//
//		@DeleteMapping("/bookings/{id}")
//		public ResponseEntity<?> deleteBookingById( @PathVariable int id) {
//			CandidateDTO candidateDTO = candidateService.getCandidateById(id);
//			if (candidateDTO != null) {
//				candidateService.deleteCandidate(candidateDTO);
//				return new ResponseEntity<Boolean>(true, HttpStatus.ACCEPTED);
//				}
//			//throw new BookingNotFoundException("Booking of Exam is not available");
//		}
//		
//
//		@GetMapping("/bookings")
//		public ResponseEntity<List<CandidateDTO>> getAllBooking() {
//			List<CandidateDTO> list = candidateService.findAll();
//			return ResponseEntity.ok(list);
//			}
//		
//	}
//}
}
