package com.java.interfaces;

import java.util.ArrayList;
import java.util.List;

public class LamdaDemo {
	public static void main(String args[]) {
		int i = 20;
		int j = 30;
		List<String> listofName = new ArrayList<>();
		listofName.add("Isha");
		listofName.add("Anu");
		listofName.add("appu");
		listofName.add("Deekshi");
		listofName.add("Gagan");
		
		
		//for loop
		for(String name :listofName) {
			System.out.println(name);
		}
		System.out.println("============");
		listofName.forEach((name) -> System.out.println(name));
		
		
		
	}

}
