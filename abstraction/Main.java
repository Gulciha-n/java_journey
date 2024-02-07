package abstraction;

public class Main {

	public static void main(String[] args) {
	
		GameCalculator gameCalculator = new WomanGameCalculator();
		
		gameCalculator.count();
		gameCalculator.gameover(); 

		
		
	}
}

