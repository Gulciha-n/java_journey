package class2;

import Class1.Account;

public class Main {
	
	static void myMethod() {
		System.out.println("This is my method.");
	}
	
	static int sum(int x , int y) {
		return x+y;
	}
	
	
	public void field(String field){
		System.out.println("Your field is : " + field);
	}
	
	public int sub(int a , int b) {
		return a-b;
	}
	public void add(Account account) {
		System.out.println("Added" + account.name());
	
	}
	
	
	int x = 5;
	final int y = 8;
	String name = "Gülcihan";
	
	public static void main(String[] args) {
		
		myMethod();
		System.out.println(sum(5, 10));   // "sum" methods return the sum and we should print it.
		
		//We should create an object for public method
		Main myObj = new Main();
		myObj.x = 20;
		// myObj.y = 10;  // cannot assign a value to a final variable
		
		System.out.println(myObj.x);
		System.out.println(myObj.y);
		System.out.println("Name : " + myObj.name);
		
		Account a1 = new Account();
		System.out.println(a1.name());
	
	}
	
	
}
