package exceptions;

public class Try_Catch_Finally {

	public static void main(String[] args) {
		
		try {
			
			int numbers [] = new int [] {10,20,30,40};
			System.out.println(numbers[5]);
		}
		catch (NullPointerException a) {
			System.out.println(a);
		}
		catch (IndexOutOfBoundsException b ) {
			System.out.println("Error : " + b);
		}
		catch(Exception exeption) {  
			System.out.println("Logged : " + exeption);
		}
		
		finally {
			System.out.println("Finally block always will be executed");
		} 
	}
}
