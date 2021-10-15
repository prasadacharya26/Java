package com.wolken.exception_handling.exception.compiletime_exception;

public class HallticketException extends Exception {
	String msg;
	
	HallticketException(String msg){
		this.msg=msg;
	}
	 @Override
	public String getMessage() {
		return msg;
	}
}
