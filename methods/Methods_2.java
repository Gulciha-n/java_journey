package methods;

public class Methods_2 {

	public static void main(String[] args) {
		
		String name = Name("Gülcihan");
		System.out.println(name);
		
		System.out.println(Name("Batu"));
		
		int summition =   Numbers(10,4,7);
		System.out.println(summition);
		
	}
	
	
	static String Name(String name) {
		return name;
		
	}
	
	static int Numbers(int... numbers) {        
		int sum=0;
		for (int i=0 ; i<numbers.length ; i++){  // <= diyemiyoruz.
			sum+= numbers[i];
		}
		return sum;
		
	}
	
}
