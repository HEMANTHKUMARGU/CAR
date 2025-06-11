package com.example.SpringJdbc;

import java.time.LocalDateTime;
import java.util.LinkedHashMap;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobelExceptionHandler {
	@ExceptionHandler(IdNotFoundException.class)
	public ResponseEntity<?> runtimeExceptionHandler(IdNotFoundException E) {
		LinkedHashMap<String, Object> body = new LinkedHashMap<String, Object>();
		body.put("timestamp", LocalDateTime.now());
		body.put("message", E.getErrMsg());
		return new ResponseEntity<>(body, HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(MandatoryFieldException.class)
	public ResponseEntity<?> mandatoryFieldMissing(MandatoryFieldException ex) {
		LinkedHashMap<String, Object> body = new LinkedHashMap<String, Object>();
		body.put("timestap", LocalDateTime.now()); 
		body.put("message", ex.getMsg());

		return new ResponseEntity<>(body, HttpStatus.BAD_REQUEST);
	}

}
