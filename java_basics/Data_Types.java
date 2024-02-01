package java_basics;

public class Data_Types {

	public static void main(String[] args) {
		
		// primitive data types :integer,float,char,boolean,long,short,byte,double
		int myNum = 5;
		float myFloatNum = 5.99f;
		char myLetter = 'C';
		boolean myBool = true;
		String myText = "Hello";
		
		System.out.println(myNum);
		System.out.println(myFloatNum);
		System.out.println(myLetter);
		System.out.println(myBool);
		System.out.println(myText);
		
		
		byte myByte = 100;  //-128 to 127 
		System.out.println(myByte);
		
		short myShort = 4500; //-32768 to 32767
		System.out.println(myShort);
		
		long myLong = 15000000000L;
		System.out.println(myLong);
		
		float myFloat = 5.75f;  //9.99 or 3.14
		System.out.println(myFloat);
		
		// * end the value with an "f" for floats and "d" for doubles
		
		double myDouble = 19.99d;
		System.out.println(myDouble);
		
		char myVar1 = 65, myVar2 = 66, myVar3 = 67; //ASCII values
		System.out.println(myVar1);
		System.out.println(myVar2);
		System.out.println(myVar3);
		
		
		/*none-primitive data types = reference types : Strings, Arrays, Classes, Interface
		  reference types refer to objects.
		  Primitive types are predefined (already defined) in Java.
		  Non-primitive types are created by the programmer and 
		  is not defined by Java (except for String).
		  A primitive type has always a value, while non-primitive types can be null. 
		*/
		
	
	}
}
