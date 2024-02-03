package loops;

public class While_Loop {

	public static void main(String[] args) {
		
		int i = 1;
		while (i<10) {
			System.out.println(i);
			i+=2;
		}
		
		// do-while 
		int j = 1;
		do {
			System.out.println(j);
			j++;
		}while (j<10);

	}

}
