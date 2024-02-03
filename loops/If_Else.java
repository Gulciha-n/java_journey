package loops;

public class If_Else {

	public static void main(String[] args) {

		int number = 20;
		if (number < 10) { // if : code to be executed if the condition is true
			System.out.println("The number is less than 10");
		} else if (number > 10) { // code to be executed if the first condition is false
			System.out.println("The number is grater than 10");
		} else { // else : code to be executed if the condition is false
			System.out.println("The number is 10");
		}

		/*
		 * Short Hand If...Else variable = (condition) ? expressionTrue :
		 * expressionFalse;
		 */

		int time = 20;
		String result1 = (time < 22) ? "Good day" : "Good evening";
		String result2 = (time > 22) ? "Hello" : "Good bye";
		System.out.println(result1);
		System.out.println(result2);

	}

}
