package array_list;

import java.util.ArrayList;

public class arraylistBasic {

	public static void main(String[] args) {
		
		ArrayList mylist = new ArrayList();
		
		mylist.add(10);
		mylist.add(20);
		mylist.add("Batu");
		
		mylist.set(0, 40);
		mylist.remove(1);
		
		System.out.println(mylist.get(0));
		System.out.println(mylist.get(1));

		System.out.println("----------------------------------");
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Ankara");
		names.add("İstanbul");
		
		for (String city : names) {
			System.out.println(city);
		}
		

	}

}
