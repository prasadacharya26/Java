package com.wolken.exception_handling.exception.compiletime_exception;

public class AgeException extends Exception{
	String msg;
	
	AgeException(String msg){
		this.msg=msg;
	}
	 @Override
	public String getMessage() {
		return msg;
	}

}
