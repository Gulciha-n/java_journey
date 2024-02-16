package overriding;

public class Main {

	public static void main(String[] args) {
		
		BaseCreditManager [] creditManagers = new BaseCreditManager[] 
				{new FarmingCreditManager(), new TeacherCreditManager(),new StudentCreditManager()};
		
		for (BaseCreditManager creditManager : creditManagers) {
			System.out.println(creditManager.count(1000));
		}
		
		
	}

}
