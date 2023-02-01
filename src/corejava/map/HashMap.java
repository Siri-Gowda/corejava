package corejava.map;

import java.util.Map;
import java.util.TreeMap;

public class HashMap {
	public static void main(String args[]) {
		HashMap map = new HashMap();
		map.getData();
		
		
	}
	public void getData(){
		Map<Integer,String> data = new TreeMap<>();
		data.put(1, "Isha");
		data.put(2, "Usha");
		data.put(3, "Appu");
		System.out.println(data);
	}

}
