package example_Injection;

public class EmailMessages implements MessageService{

	@Override
	public String message() {
		return "Sending email message";
	}
	
	

}
