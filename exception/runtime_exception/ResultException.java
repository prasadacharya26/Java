package com.wolken.exception_handling.exception.runtime_exception;

public class ResultException extends RuntimeException {
String msg;
	
	ResultException(String msg){
		this.msg=msg;
	}
	 @Override
	public String getMessage() {
		return msg;
	 }

}
