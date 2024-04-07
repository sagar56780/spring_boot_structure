package edu.qs.spring_db.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class ExceptioinHandler {
	public ResponseEntity<String> nullException(){
		return new ResponseEntity<String>("null pointer exception occoured",HttpStatus.BAD_REQUEST);
	}

}


