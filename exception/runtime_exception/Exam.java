package com.wolken.exception_handling.exception.runtime_exception;

import java.util.Scanner;
public class Exam {
	String resultException(String ans) {
		if(ans.equals("pass")) {
			System.out.println("Pass");
		}else {
			throw new ResultException("Fail");
		}
		return ans;
	}
	
	String papersubmitException(String ans) {
		if(ans.equals("yes")) {
			System.out.println("Allowed");
		}else {
			throw new PapersubmitException("Paper not submited");
		}
		return ans;
	}
	
	String seatException(String ans) {
		if(ans.equals("yes")) {
			System.out.println("Allowed");
		}else {
			throw new SeatException("This is not your place to sit");
		}
		return ans;
	}
	
	String questionPaperException(String ans){
		if(ans.equals("no")) {
			System.out.println("let him write exam");
		}else {
			throw new SeatException("Warning");
		}
		return ans;
	}
	
	public static void main(String[] args) {
		Exam exam=new Exam();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your result(pass/fail):");
		String result=sc.next();
		try {
			exam.resultException(result);
		}catch(ResultException e) {
			System.err.println(e.getMessage());
		}
		
		System.out.println("Submit your paper or not (yes/no):");
		String paper=sc.next();
		try {
			exam.papersubmitException(paper);
		}catch(PapersubmitException e) {
			System.err.println(e.getMessage());
		}
		
		System.out.println("Are sit in your place or not (yes/no):");
		String ans=sc.next();
		try {
			exam.seatException(ans);
		}catch(SeatException e) {
			System.err.println(e.getMessage());
		}
		
		System.out.println("Check student wrote anything paper or not (yes/no):");
		String ch=sc.next();
		try {
			exam.questionPaperException(ch);
		}catch(QuestionPaperException e) {
			System.err.println(e.getMessage());
		}
	}
}