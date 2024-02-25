package example_Injection;

public class SMSmessage implements MessageService{

	@Override
	public String message() {
		return "Sending SMS message";
	}


	
	

}
