package threadDemo;

public class Main {

	public static void main(String[] args) {

		CronometerThread Thread1 = new CronometerThread("Thread1");
		CronometerThread Thread2 = new CronometerThread("Thread2");
		CronometerThread Thread3 = new CronometerThread("Thread3");

		Thread1.start();
		Thread2.start();
		Thread3.start();
	}
}
