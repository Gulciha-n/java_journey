package arrays;

public class Arrays3 {

	public static void main(String[] args) {
		double [] numbers = {1.5,4.8,9.8,8.7};
		double total = 0;
		double max = numbers[0];
		
		for (double num:numbers) {
			total = num + total;
			if(max<num) {
				max=num;
			}
		}
		System.out.println("Sum of numbers : " + total);
		System.out.println("max : " + max);
	}   

}
