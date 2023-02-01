package com.java.interfaces;

import java.util.Vector;

public class VectorDemo {
	public static void main (String args[]) {
		Vector v = new Vector(10);
		v.add(1);
		v.add(1);
		v.add(1);
		v.add(1);
		v.add(1);
		v.add(1);
		v.add(1);

		
		/*v.add("Isha");
		v.add("Siri");
		v.add("Deekshi");
		v.add("Gagan");
		v.add("Lakshmi");
		v.add("Veera");
		v.add("Appu");
		v.add("Smiley");
		v.add("Rithu");
		v.add("Siru");
		v.add("Cherry");
		v.add("Isha");
		v.add("Siri");
		v.add("Deekshi");
		v.add("Gagan");
		v.add("Lakshmi");
		v.add("Veera");
		v.add("Appu");
		v.add("Smiley");
		v.add("Rithu");
		v.add("Siru");
		v.add("Cherry");*/

		System.out.println(v.capacity());
		System.out.println(v.size());
	}

}
