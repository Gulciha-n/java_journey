package constructor;

public class Car {
	
	private String name ;
	private int age;
	
	public Car (String name , int age) {
		this.name = name;
		this.age = age;
	}
	
	public static void main(String[] args) {
		
		Car car1 = new Car("Audi", 2);
		System.out.println(car1.name);
		System.out.println(car1.age);
	}
}