package overriding;

public class StudentCreditManager extends BaseCreditManager{
	
	public double count(double amount) {
		return amount * 1.10;
		
	}

}
