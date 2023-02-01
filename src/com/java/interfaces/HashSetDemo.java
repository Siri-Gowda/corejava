package com.java.interfaces;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	public static void main(String[]args) {
		HashSet hs = new HashSet();
		hs.add("Lilly");
		hs.add("Chamki");
		hs.add("Honey");
		hs.add("Sweety");
		hs.add("Tommy");
		hs.add("Honey");//not allow duplicate values
		
		Iterator it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
