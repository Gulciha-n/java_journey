package exceptions;

public class BalanceInsufficientException extends Exception {
	String message;
	
	public BalanceInsufficientException(String message) {
		this.message = message;
		
	}
	
	public String getmessage() {
		return this.message;
	}
}

