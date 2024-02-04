package collections;

import java.util.ArrayList;

public class Arrays {

	public static void main(String[] args) {
	
		ArrayList numbers = new ArrayList();
		
		System.out.println(numbers.size());
		
		//adding an element 
		numbers.add(10);
		numbers.add(20);
		numbers.add("Array list");
		
		System.out.println(numbers.size());
		
		System.out.println(numbers.get(0));
		System.out.println(numbers.get(1));
		System.out.println(numbers.get(2));
		
		//changing an element 
		numbers.set(0, 100);  
		System.out.println(numbers.get(0));

		//remove an element 
		numbers.remove(1);
		System.out.println(numbers.get(1));
		
		//remove all elements
		//numbers.clear();
		//System.out.println(numbers); //empty list
	
		for (Object i : numbers) {
			System.out.println(i);
			
		}
	}
}
