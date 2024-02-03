package loops;

public class Foreach {

	public static void main(String[] args) {
		
		String [] names =  {"Batu","Elif", "Mehmet","Eren"};	
		for (String element : names) {
			System.out.println(element);			
		}
		 
		
		int [] numbers = {10,4,7,52,20};
		
		for (int num : numbers) {
			System.out.println(num);
		}
	}
}

