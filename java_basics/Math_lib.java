package java_basics;

public class Math_lib {

	public static void main(String[] args) {
		
		System.out.println(Math.max(10,20));
		System.out.println(Math.min(10,20));
		System.out.println(Math.sqrt(36));
		System.out.println(Math.abs(-15));
		System.out.println(Math.random()); //a random number between 0.0 (inclusive), and 1.0 (exclusive)

		
		int randomNum = (int)(Math.random()*101); //a random number between 0 and 100
		System.out.println(randomNum);
		
		int x = 10;
		System.out.println(x == 10); 	
		
		
	}
}


// not : public class ismi , java'nın kendi sınıf isimleri ile çakışmaması gerekir.

