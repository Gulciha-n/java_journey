package arrays;

import java.util.Scanner;

public class Array4 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("How many element will be in the array ? : ");		
		int lenghtArray = scanner.nextInt();
		scanner.nextLine();
		String [] names = new String[lenghtArray];
		
		//kullanıcı sayı girişi yaptıktan sonra nextLine() çağrısını yapmamız gerekiyor
		for (int i = 0 ; i<lenghtArray ; i++) {
			System.out.print("Enter the element of " + i + " : ");
			names[i] = scanner.nextLine();
		}
		
		for (int i = 0 ; i<names.length;i++) {
			System.out.println(names[i]);
		}
		scanner.close();
	}

}

