package corejava.map;

import java.util.Map;
import java.util.TreeMap;

public class Anu {
	public static void main(String args[]) {
		getAnuDetails();
		
		
		//creating object
		SiriDetails isha = new SiriDetails();
		isha.setName("Shireesha");
		isha.setAddress("Anantapur Dist");
		isha.setDOB("July 26th");
		isha.setSpecialization("Bsc Computer Science");
		isha.setSSC(9.5);
		isha.setIntermediate(89);
		
		SiriDetails isha1 = new SiriDetails();
		isha1.setName("Shireesha");
		isha1.setAddress("Anantapur Dist");
		isha1.setDOB("July 26th");
		isha1.setSpecialization("Bsc Computer Science");
		isha1.setSSC(9.5);
		isha1.setIntermediate(89);
		
		
		//using equals  method
		System.out.println();
		System.out.println(isha.hashCode());
		System.out.println(isha1.hashCode());
		//using equals method
		System.out.println();
		System.out.println(isha==isha1);
		System.out.println(isha.equals(isha1));

		
		
	}
	//static method
	public static void getAnuDetails() {
		//creating map object using TreeMap interface
		Map<Integer,String> anu = new TreeMap<>();
		anu.put(1, "Hi");
		anu.put(4, " Sister");
		anu.put(3, " Dear");
		anu.put(2, " My");
		anu.put(5," *Anu*");
		
		for(Map.Entry<Integer, String> usha:anu.entrySet()){
			System.out.print(usha.getValue());
			
			
		}
	
		
			
		}
		
			
		}
	


