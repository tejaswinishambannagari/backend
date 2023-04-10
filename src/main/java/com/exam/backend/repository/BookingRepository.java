package com.exam.backend.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.exam.backend.dto.BookingDTO;
import com.exam.backend.entity.Booking;

@Repository

public interface BookingRepository  extends CrudRepository<Booking, Integer> {

}
