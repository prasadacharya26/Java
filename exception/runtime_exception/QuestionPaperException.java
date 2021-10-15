package com.wolken.exception_handling.exception.runtime_exception;

public class QuestionPaperException extends RuntimeException {
	String msg;
	
	QuestionPaperException(String msg){
		this.msg=msg;
	}
	 @Override
	public String getMessage() {
		return msg;
	 }
}
