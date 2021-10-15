package com.wolken.exception_handling.exception.runtime_exception;

public class PapersubmitException extends RuntimeException {
String msg;
	
	PapersubmitException(String msg){
		this.msg=msg;
	}
	 @Override
	public String getMessage() {
		return msg;
	 }

}
