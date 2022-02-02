package com.responsedata.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@ControllerAdvice
public class ApplicationExceptionHandler extends ResponseEntityExceptionHandler{
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@ExceptionHandler(Exception.class)
	public ResponseEntity handleException(Exception e) {
		DefaultExceptions exception = new DefaultExceptions(HttpStatus.BAD_GATEWAY.value(), "Falha na Requisição!");
		log.info(PAGE_NOT_FOUND_LOG_CATEGORY);
		return new ResponseEntity(exception, HttpStatus.BAD_GATEWAY);		
	}
}
