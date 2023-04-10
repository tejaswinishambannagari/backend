package com.exam.backend.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(BookingNotFoundException.class)
	public @ResponseBody Error checkNoSuchDuplicateExamBookingException(BookingNotFoundException e,HttpServletRequest req) {
		Error E1=new Error();
		return E1;
	}
	
	
    
}
