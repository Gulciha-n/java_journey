package example_abstract;

public class MySqlDatabase extends BaseClass{

	@Override
	public void connectToDatabase() {
		
		System.out.println("Connected MySqlDatabase");
		uNamePsswrd("Batu", "9876");

	}
	
}

