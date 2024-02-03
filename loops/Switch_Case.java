package loops;

public class Switch_Case {

	public static void main(String[] args) {
		char grade = 'C';

		switch (grade) {
		case 'A':
			System.out.println("your letter grade is : A ");
			break;
		case 'B':
		case 'b': // we can use more than one case in the same block
			System.out.println("your letter grade is : B ");
			break;
		case 'C':
			System.out.println("your letter grade is : C ");
			break;
		case 'D':
			System.out.println("your letter grade is : D ");
		case 'E':
			System.out.println("your letter grade is : E ");
			break;
		case 'F':
			System.out.println("your letter grade is : F ");
			break;
		default:
			System.out.println("invalid grade");
		}

	}

}



