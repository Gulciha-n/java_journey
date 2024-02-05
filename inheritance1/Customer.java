package inheritance1;

public class Customer extends Person {
	
	String email;
	
	public void list() {
		System.out.println("Customer listed.");
	}
	
	public void add() {
		System.out.println("Customer added.");
		
	}
}