package com.wolken.exception_handling.exception.runtime_exception;

public class SeatException extends RuntimeException {
	String msg;
	
	SeatException(String msg){
		this.msg=msg;
	}
	 @Override
	public String getMessage() {
		return msg;
	 }

}