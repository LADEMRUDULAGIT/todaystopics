package com.axis.exception;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
@RestControllerAdvice
public class GlobalExceptionHandler {
	//@ExceptionHandler
	//public ResponseEntity<String> noIdFound(IDNotFoundException exception){
	//	return new ResponseEntity<String>(exception.getmsg(),HttpStatus.NOT_FOUND);
	//}
		@ExceptionHandler(IDNotFoundException.class)
		public ResponseEntity<ErrorInfo> noIdFound(IDNotFoundException exception){
			
			ErrorInfo errorInfo=new ErrorInfo();
			errorInfo.setErrorMessage(exception.getmsg());
			errorInfo.setHttpStatus(HttpStatus.NOT_FOUND.toString());
			errorInfo.setDate(LocalDate.now());
			return new ResponseEntity<ErrorInfo>(errorInfo,HttpStatus.NOT_FOUND);
		}
		@ExceptionHandler(InvalidPriceException.class)
		public ResponseEntity<ErrorInfo> noIdFound(InvalidPriceException exception){
			
			ErrorInfo errorInfo=new ErrorInfo();
			errorInfo.setErrorMessage(exception.getmsg());
			errorInfo.setHttpStatus(HttpStatus.NOT_FOUND.toString());
			errorInfo.setDate(LocalDate.now());
			return new ResponseEntity<ErrorInfo>(errorInfo,HttpStatus.NOT_FOUND);
		}
}
