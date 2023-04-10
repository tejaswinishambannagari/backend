package com.exam.backend.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;




@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class PaymentNotFoundException   extends RuntimeException {
	
private static final long serialVersionUID = 1L;
public PaymentNotFoundException(String message) {
super(message);
}

}
