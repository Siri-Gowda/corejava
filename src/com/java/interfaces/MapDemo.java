package com.java.interfaces;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapDemo {
	public static void main(String args[]) {
		HashMap hm = new HashMap();
		hm.put("name", "Siri");
		hm.put("dob", "26th July");
		//hm.put("name", "Isha");
		hm.put("nickName", "Siri");
		Set s = hm.keySet();
		
		System.out.println(hm);
		Iterator it = s.iterator();
		while (it.hasNext()) {
			Object obj =it.next();
			String str = (String)obj;
			System.out.println(str);
		
	}

}
}