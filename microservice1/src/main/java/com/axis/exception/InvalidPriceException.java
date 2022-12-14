package com.axis.exception;

public class InvalidPriceException extends RuntimeException{
	String msg;
	public InvalidPriceException(String msg) {
		super();
		this.msg=msg;
	}
	public String getmsg() {
		return msg;
	}
}
