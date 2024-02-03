package Class1;

public class Main {

	public static int add(int num1,int num2) { //public=obje oluşturulması gerekir.
		return num1+num2;
	}
	
	public static int mult(int num1,int num2) {
		return num1*num2;
	}
	 
	public static int sub(int num1,int num2) {
		return num1-num2;
	}
	
	public static void main(String[] args) {
		
		Main equation = new Main();   //create a object from the Main class
		
		int result = equation.add(10,23); //call the methods from objects
		System.out.println(result);
		
		int result2 = equation.mult(2, 25);
		System.out.println(result2);
		
		Account abc = new Account();
		System.out.println(abc.name());
	}
	
}




