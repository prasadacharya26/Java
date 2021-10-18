package com.wolken.exception_handling.list.Linked_List;

import java.util.LinkedList;

public class Tester {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(8197192003l);
		list.add("prasadacharya@gmail.com");
		list.addFirst("Prasad");
		list.addLast("Udupi");
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	
		System.out.println("-------------------------");
		System.out.println("getFirst:"+ list.getFirst());
		System.out.println("getLast:"+ list.getLast());
		
		System.out.println("------------Push-------------");
		list.push("Acharya");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("------------Pop-------------");
		list.pop();
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("------------Peak-------------");
		System.out.println("Peek:"+ list.peek());
		System.out.println("PeekFirst:"+ list.peekFirst());
		System.out.println("PeekLast:"+ list.peekLast());
		
		System.out.println("------------remove-------------");
		System.out.println("Remove:"+ list.remove());
		System.out.println("RemoveLast:"+ list.removeLast());
		System.out.println("RemoveFirst:"+ list.removeFirst());
	}
}
