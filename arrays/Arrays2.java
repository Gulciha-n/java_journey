package arrays;

public class Arrays2 {

	public static void main(String[] args) {
		String [] fields = new String[3];
		fields[0] = "Engineer";
		fields[1] = "Nurse";
		fields[2] = "Doctor";
				
		for (int i=0 ; i<fields.length ; i++){
			System.out.println(fields[i]);
		}
		System.out.println("------------------------");
		
		for(String field:fields) {
			System.out.println(field);	
		}
		
		System.out.println("------------------------");
		
		int [] numbers = new int[2];
		numbers[0] = 10;
		numbers[1] = 15;
		
		for(int number:numbers) {
			System.out.println(number);
		}
		
		System.out.println("-------------------------");
		
		double [] nums = new double[2];
		nums[0] = 2.5;
		nums[1] = 7.8;
		
		for(double num:nums) {
			System.out.println(num);
		}
	}

}
