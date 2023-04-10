package com.exam.backend.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.backend.dto.PaymentDTO;
import com.exam.backend.entity.Payment;
import com.exam.backend.repository.PaymentRepository;
import com.exam.backend.service.PaymentService;




@Service
public class PaymentServiceImpl  implements PaymentService{

	@Autowired
	private PaymentRepository paymentRepository;
	
	@Override
	public PaymentDTO addPayment(PaymentDTO paymentDto) {
		
		
		Payment payment = new Payment();
		BeanUtils.copyProperties(paymentDto, payment);
		Payment paymentSave=paymentRepository.save(payment);
		paymentDto.setPaymentid(paymentSave.getPaymentid());
		payment.setBookingid(paymentDto.getBookingid());
		payment.setPaymentdate(paymentDto.getPaymentdate());
		return paymentDto;
}

	@Override
	public PaymentDTO updatePayment(PaymentDTO paymentDTO) {
		// TODO Auto-generated method stub
       
		
        Payment payment = new Payment();
		payment.setPaymentid(paymentDTO.getPaymentid());
		payment.setBookingid(paymentDTO.getBookingid());
		payment.setPaymentdate(paymentDTO.getPaymentdate());
		
		
		return paymentDTO;
	}

	@Override
	public boolean deletePayment(PaymentDTO paymentDTO) {
		// TODO Auto-generated method stub
		Payment payment = new Payment();
		payment.setPaymentid(paymentDTO.getPaymentid());
		paymentRepository.delete(payment);
		return true;
	}

	@Override
	public PaymentDTO getById(int id) {
		// TODO Auto-generated method stub
		Optional<Payment> booking = paymentRepository.findById(id);
		if (booking.isPresent()) {
			PaymentDTO dto = new PaymentDTO();
			BeanUtils.copyProperties(booking.get(), dto);
			return dto;
		}
		return null;
	}

	@Override
	public List<PaymentDTO> findAll() {
		// TODO Auto-generated method stub
		Iterable<Payment> payment = paymentRepository.findAll();
		List<PaymentDTO> dtos = new ArrayList<>();
		for (Payment payments : payment) {
			PaymentDTO dto = new PaymentDTO();
			BeanUtils.copyProperties(payments, dto);
			dtos.add(dto);
		}
		return dtos;
	}

}