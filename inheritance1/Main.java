package inheritance1;

public class Main {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		Employee employee = new Employee();
		
		customer.name = "Cansu"; 
		employee.name = "Damla";
		employee.salary = 50000;
		employee.id = 7299348;
		
		System.out.println(customer.name);
		System.out.println(employee.name);
		System.out.println(employee.id);

		System.out.println();

		customer.list();
		customer.add();
	}
}
