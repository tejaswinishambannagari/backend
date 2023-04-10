package com.exam.backend.BookingController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exam.backend.dto.PaymentDTO;
import com.exam.backend.exception.PaymentNotFoundException;
import com.exam.backend.service.PaymentService;


	@RestController
	@RequestMapping("/api/payment")
	public class PaymentController {
		@Autowired
		public PaymentService paymentService;

		//http://localhost:9091/api/payment/addPayment
		@PostMapping("/addPayment")
		public ResponseEntity<PaymentDTO> addPayment(@RequestBody PaymentDTO payment) {

			PaymentDTO savepayment = paymentService.addPayment(payment);
			return ResponseEntity.ok(savepayment);

		}

		@GetMapping("/fetchPaymentById/{id}")
		public ResponseEntity<PaymentDTO> getPaymentById(@PathVariable int id) {
			PaymentDTO paymentDTO = paymentService.getById(id);
			return new ResponseEntity<PaymentDTO>(paymentDTO, HttpStatus.FOUND);
		}

		@PutMapping("/Booking")
		public ResponseEntity<PaymentDTO> updateBooking(@RequestBody PaymentDTO bookingDTO) {
			return new ResponseEntity<PaymentDTO>(paymentService.updatePayment(bookingDTO), HttpStatus.ACCEPTED);

		}

	@DeleteMapping("/deletePayment/{id}")
	public ResponseEntity<?> deletePaymentById(@PathVariable int id) {
		PaymentDTO paymentDTO = paymentService.getById(id);
		if (paymentDTO != null) {
			paymentService.deletePayment(paymentDTO);
			return new ResponseEntity<Boolean>(true, HttpStatus.ACCEPTED);
			}
		throw new PaymentNotFoundException("Booking of Exam is not available");
	}
	


		@GetMapping("/fetchAllPayment")	
		public ResponseEntity<List<PaymentDTO>> getAllPayment() {
			List<PaymentDTO> list = paymentService.findAll();
			return ResponseEntity.ok(list);
			}

}
