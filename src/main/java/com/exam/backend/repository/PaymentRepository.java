package com.exam.backend.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.exam.backend.entity.Payment;

@Repository

	public interface PaymentRepository   extends CrudRepository<Payment, Integer> {
		Iterable<Payment> findAll();

	}

