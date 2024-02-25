package example_Injection;

public class MessageProcessor {
	
	private MessageProcessor message;
	
	public  MessageProcessor(MessageProcessor message) {
		this.message = message;
	}
	
	public MessageProcessor getMessage() {
		return message;
	}

	public void setMessage(MessageProcessor message) {
		this.message = message;
	}
}

