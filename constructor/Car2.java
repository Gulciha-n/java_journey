package constructor;

public class Car2 {
	
	private String name;
	private int age;
	
	public Car2() {
		this.name = "Audi";
		this.age= 3;
	}

	public static void main(String[] args) {
		
		Car2 car2 = new Car2();
		
		System.out.println(car2.name);
		System.out.println(car2.age);

	}
}
