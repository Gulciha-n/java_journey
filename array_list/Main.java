package array_list;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Customer> customers = new ArrayList<Customer>();
		
		customers.add(new Customer(1,"a","b"));
		customers.add(new Customer(2,"d","e"));
		customers.add(new Customer(3,"f","g"));
		customers.add(new Customer(4,"x","y"));
		
		//dışardan bir nesne üretelim
		Customer customer0 = new Customer(5,"x","y");
		customers.add(customer0);
		
		
		customers.remove(1);
		
		for (Customer customer : customers) {
			
			System.out.print(customer.firsname + " ");
			System.out.print(customer.lastname + " ");
			System.out.println(customer.id);
		}
	}
}
