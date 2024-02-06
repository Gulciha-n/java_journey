package interfaces;

public class Main {

	public static void main(String[] args) {
		
		ICustomerDal customerDal = new MySqlCustomerDal();
		customerDal.add();
		
		ICustomerDal customerDal2 = new OracleCustomerDal();
		customerDal2.add();
		
		OracleCustomerDal customerDal3 = new OracleCustomerDal();
		customerDal3.add();
		
		
		CustomerManager	customerManager = new CustomerManager(new MySqlCustomerDal());
		customerManager.add();
	}
}
