package java_basics;

public class Type_Casting { //Tür Dönüşümü

	public static void main(String[] args) {
		
		//Widening Casting: from smaller to larger 
		int myInt = 4;
		double myDouble = myInt; // Automatic casting: integer to double
		
	    System.out.println(myInt);      
	    System.out.println(myDouble); 
	    
	    
	    //Narrowing Casting: manually by placing the type in parentheses in front of the value
	    double myDbl = 9.78d;
	    int myInt1 = (int)myDbl; // Manual casting: double to integer

	    System.out.println(myDbl);   
	    System.out.println(myInt1);     
	    
	}

}
