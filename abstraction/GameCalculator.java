package abstraction;

public abstract class GameCalculator {
	public abstract void count();
	
	public void message() {
	}
	
	public final void gameover() {
		System.out.println("Game Over");
	}
}
