package com.ModelProjectTask.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {
   
   @ExceptionHandler(NameNotFoundException.class)
   public ResponseEntity<Object> NotFound(NameNotFoundException ne) {
	   return new ResponseEntity<>("Please Change input 'id' to Check", HttpStatus.BAD_REQUEST);
   }
}
