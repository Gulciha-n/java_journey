package loops;

public class For_Loop {

	public static void main(String[] args) {
		
		for (int i=0 ; i<10 ; i+=2) {
			System.out.println(i); 
			// döngü içerisinde tanımladığımız i sadece döngü içerisinde kullanılabilir.
		}
		
		//nested loops
		
		for (int i=1 ; i<=3 ; i++) {
			System.out.println("outer : " + i);
			for(int j=1 ; j<=3 ; j++ ) {
				System.out.println("inner : " + j);
			}
		}
		
		
		//break
		for(int i=0 ; i<10 ; i++) {
			if(i==4) {
				break;
			}
			System.out.println(i);
		}
		
		
		//continue 
		for(int i=1 ; i<10 ; i++) {
			if(i==4) {
				continue;
			}
			System.out.println(i);
		}	
		

	}

}
