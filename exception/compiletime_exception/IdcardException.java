package com.wolken.exception_handling.exception.compiletime_exception;

public class IdcardException extends Exception {
	String msg;
	
	IdcardException(String msg){
		this.msg=msg;
	}
	 @Override
	public String getMessage() {
		return msg;
	 }
}