package com.java.interfaces;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String args[]) {
		LinkedList<Student> ll = new LinkedList<>();
		
		ll.add(new Student(34));
		Student s2 = new Student(25);
		ll.add(s2);
		Iterator it = ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
}


class Student{
	int rollNo;
	Student(int rollNo){
		this.rollNo=rollNo;
		
	}
	public String toString() {
		return " " +rollNo;
	}


		
		
	}


