package java_basics;

import java.util.Scanner;

public class scannerInput {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//new : class'tan bir obje üretmek için kullanılır.
		System.out.print("enter your name : ");
		String name =  scanner.nextLine();
		System.out.println("welome " +name);
		
		System.out.print("enter your age : ");
		int age = scanner.nextInt();
		System.out.println("Age : "+ age);
		
		System.out.print("Float number : ");
		float num = scanner.nextFloat();
		System.out.println("Float number : "+ num);
		
		System.out.print("Your department :");
		String depart  = scanner.nextLine();
		System.out.println("Department :" + depart);
		scanner.close();		
		
	}
}


