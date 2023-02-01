package com.java.interfaces;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkedHashSetDemo {
	public static void main(String args[]) {
		LinkedHashSet ls = new LinkedHashSet();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(40);
		ls.add(50);
		
		Iterator it = ls.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
