package com.java.interfaces;

import java.util.Iterator;

import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String args[]) {
		TreeSet ts = new TreeSet();
		ts.add(1);
		ts.add(0);
		ts.add(6);
		ts.add(2);
		ts.add(5);
		
		TreeSet ts1 = (TreeSet)ts.subSet(1,5);
		System.out.println(ts1);
		System.out.println(ts.first());
		
		Iterator it = ts.descendingIterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}



