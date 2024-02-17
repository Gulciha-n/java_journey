package polymorphism;

public class Overloading {
	private int salary;
	
	public Overloading() {
		this(800);
	}
	public Overloading(int salary) {
		this.salary = salary;
	}
	
	public void add() {
		System.out.println("add fonction started.");
	}
	
	public int add(int num1) {
		return num1;
	}
	
	public int add(int num1 , int num2) {
		return num1+num2;
	}
	
	public int add(int num1 , int num2 , int num3) {
		return num1+num2;
	}

	public double add(double num1, double num2) {
		return num1+num2;
	}
	
	
	public static void main(String[] args) {
		
		Overloading exp = new Overloading();
		
		exp.add();
		
 		int result1 = exp.add(5, 14);
 		System.out.println("result : " + result1);
 		
 		int result2 = exp.add(10, 15, 20);
 		System.out.println("result : " + result2);
 		
 		double result3 = exp.add(4.5, 1.7);
 		System.out.println("result : " + result3);
 		
	}
}

//not: return type'a göre overloading yapılamaz.
// ogr :  void add() ve  int add() seklinde yazılamaz. bu overloading olmaz.
 
