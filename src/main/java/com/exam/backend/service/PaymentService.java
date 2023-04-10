package com.exam.backend.service;

import java.util.List;


import com.exam.backend.dto.PaymentDTO;




public interface PaymentService {
public  PaymentDTO addPayment(PaymentDTO booking);
	
	public PaymentDTO updatePayment(PaymentDTO bookingDTO);
	
	public boolean deletePayment(PaymentDTO bookingDTO);
	
	public PaymentDTO getById( int id);
	
	public List<PaymentDTO> findAll();
}