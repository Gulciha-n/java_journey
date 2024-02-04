package collections;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<String> cities = new ArrayList<String>();
		
		cities.add("İzmir");
		cities.add("istanbul");
		cities.add("Ankara");
		
		Collections.sort(cities);
		
		for (String city : cities) {
			System.out.println(city);
		}

		
	}

}
