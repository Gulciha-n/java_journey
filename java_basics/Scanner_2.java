package java_basics;

import java.util.Scanner;

public class Scanner_2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first integer: ");
		int number1 = input.nextInt();
		
		System.out.print("Enter the second integer: ");
		int number2 = input.nextInt();
		
		int sum = number1+number2;
		
		System.out.printf("Sum is %d%n" ,sum);  
		//Yer tutcu (%) kullandıgımızda printf ve  "," kullanırız.
		//System.out.prinln("Sum is" +sum); kullanınca prinln ve "+" kullanıyoruz. 
		
		input.close();
	
	}
}

