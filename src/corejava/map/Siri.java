package corejava.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Siri {
	public static void main(String args[]) {
		getS();
		
	}
	public static void getS() {
		Map<String ,Double> siruGrades = new LinkedHashMap<>();
		siruGrades.put("10th-95%",9.50 );
		siruGrades.put("Inter-89%",8.90);
		siruGrades.put("Degree-78%",7.80);
		for(Entry<String,Double> sri : siruGrades.entrySet()) {
			System.out.println(sri.getValue());
			
		}
		Map<String ,Double> siruGrades1 = new TreeMap<>();
		siruGrades1.put("10th-95% ",9.50 );
		siruGrades1.put("Inter-89% ",8.90);
		siruGrades1.put("Degree-78% ",7.80);
		if(siruGrades1.containsValue(9.00)) {
			System.out.println("True");
		}else {
			System.out.println(siruGrades1);
		}
	
			
		}

		
	}


