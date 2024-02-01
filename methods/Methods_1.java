package methods;

public class Methods_1 {

	public static void main(String[] args) {
		String msg = "Hello Java";
		
		String newMsg = msg.substring(0,5); //substring bize sonuç veriyor yani bir değer döndürüyor.
		System.out.println(newMsg);
		
		String msgg = message();
		System.out.println(msgg);
		
		int sum = sum(10, 20);
		System.out.println(sum);
		
		int addition = sum(10,20,50);  //10,20,50 = argument
		System.out.println(addition);
		
		
		update();
		del();
		add(4,5);
		System.out.println(sum(7, 8));  //void olmayan metod
		System.out.println(message());

	}
	
    //void bize sonuç olarak bir şey vermez. Sadece gidip yapar return etmez.	
	public static void add(int num1,int num2) {
		System.out.println("Added");
	}

	public static void del() {             
		System.out.println("Deleted");
	}
	
	public static void update() {       // void olarak tanımladıgımız metodları bir değişkene atayamıyoruz.
		System.out.println("Updated");
	}
	
	public static int sum(int num1,int num2) { //num1 , num2 = parameter
		int result = num1 + num2;
		return result;
	}
	
	
	// ... yazarak methodu çağırdığımızda istediğimiz kadar parametre yazabiliriz.
	// variable argument
	public static int sum(int... numbers) {
		
		int rslt = 0;
		for (int num:numbers) {
			rslt += num;
		}
		return rslt;
	}
	
	public static String message() {
		return "Ankara";   //bu metodu string türünde bir değişkene atayabiliriz.
	}
}
