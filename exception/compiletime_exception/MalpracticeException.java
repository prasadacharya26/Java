package com.wolken.exception_handling.exception.compiletime_exception;

public class MalpracticeException extends Exception {
	String msg;
	
	MalpracticeException(String msg){
		this.msg=msg;
	}
	 @Override
	public String getMessage() {
		return msg;
	}
}
