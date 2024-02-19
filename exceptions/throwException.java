package exceptions;

public class throwException {

	public static void main(String[] args) throws Exception {
		
		AccountManager manager = new AccountManager();
		System.out.println(manager.getBalance());
		
		manager.deposit(100);
		System.out.println(manager.getBalance());
		
		try {
			manager.withdrow(10);
			System.out.println(manager.getBalance());
		} catch (Exception e) {
			System.out.println(e);
		}
		
		try {
			manager.withdrow(200);
		} catch (BalanceInsufficientException exception) {
			System.out.println(exception.getmessage());
			}
	}
}
