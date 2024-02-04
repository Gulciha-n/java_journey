package collections;

import java.util.HashMap;

public class Hashmap {

	public static void main(String[] args) {
		
		HashMap<String, String> dict = new HashMap<String, String>();
		
		dict.put("Book", "Kitap");
		dict.put("computer", "bilgisayar");
		dict.put("table", "masa");
		
		System.out.println(dict.size());	
		for(String item : dict.keySet()){
			System.out.println("Key: " + item + " Value: " + dict.get(item));
		}
		
		for(String item : dict.values()){
			System.out.println(item);
		}
		
		System.out.println(dict);
		
		System.out.println(dict.get("table"));
		
		dict.remove("table");
		System.out.println(dict.get("table"));
		// null = no reference
		
		dict.clear();
		System.out.println(dict);
		
	}

}
