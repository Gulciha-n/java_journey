package java_basics;

public class Variables {

	public static void main(String[] args) {
		
		String name = "Gulcihan";
		System.out.println(name);
		
		int myNum = 15;
		System.out.println(myNum);
		
		myNum = 20;  // overwrite
		System.out.println(myNum);
		
		final int myNum2 = 25;  //final or constant keywords = unchangeable variable
		System.out.println(myNum2);
		
		//myNum2 = 30; //err : The final local variable myNum2 cannot be assigned.
		//System.out.println(myNum2);
		

		 int x = 5 , y = 6 ,z = 50;
		System.out.println(x + y + z);
		

	}

}
