package com.java.interfaces;

import java.util.Stack;

public class SrackDemo {
	public static void main(String args[]) {
		Stack s = new Stack();
		s.push(5);
		s.push(3);
		s.push(1);
		s.push(4);
		s.push(8);
		System.out.println(s);
		System.out.println(s.peek());
		s.pop();
		System.out.println(s);
		System.out.println(s.empty());
		System.out.println(s.search(5));
	}

}
