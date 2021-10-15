package com.wolken.exception_handling.exception.compiletime_exception;

import java.util.Scanner;
public class Exam {
	String hallticketException(String ans) throws HallticketException  {
		if(ans.equals("yes")) {
			System.out.println("Allowed");
		}else {
			throw new HallticketException("Hallticket not found");
		}
		return ans;
	}
	
	String idcardException(String ans) throws IdcardException {
		if(ans.equals("yes")) {
			System.out.println("Allowed");
		}else {
			throw new IdcardException("ID Card not found");
		}
		return ans;
	}
	
	byte ageException(byte age) throws AgeException {
		if(age>18) {
			System.out.println("Allowed");
		}else {
			throw new AgeException("Your age is below 18");
		}
		return age;
	}
	
	String malpracticeException(String ans) throws MalpracticeException {
		if(!ans.equals("yes")) {
			System.out.println("Allowed");
		}else {
			throw new MalpracticeException("Suspend");
		}
		return ans;
	}
	public static void main(String[] args) {
		Exam exam=new Exam();
		Scanner sc=new Scanner(System.in);
		System.out.println("Check if student have hallticket or not (yes/no):");
		String hallticket=sc.next();
		try {
			exam.hallticketException(hallticket);
		}catch(HallticketException e) {
			System.err.println(e.getMessage());
		}
		
		System.out.println("Check if student have ID Card or not (yes/no):");
		String idcard=sc.next();
		try {
			exam.idcardException(idcard);
		}catch(IdcardException e) {
			System.err.println(e.getMessage());
		}
		
		System.out.println("Enter age:");
		byte age=sc.nextByte();
		try {
			exam.ageException(age);
		}catch(AgeException e) {
			System.err.println(e.getMessage());
		}
		
		System.out.println("Check for malpractice or not (yes/no):");
		String ans=sc.next();
		try {
			exam.malpracticeException(ans);
		}catch(MalpracticeException e) {
			System.err.println(e.getMessage());
		}
	}
}
