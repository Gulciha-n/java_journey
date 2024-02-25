package example_abstract;

public class Main {

	public static void main(String[] args) {
		
		BaseClass mysqlBaseClass = new MySqlDatabase();
		
        DbManagement management = new DbManagement(mysqlBaseClass);
        
        management.connect();
        
	}
}

/*
 DbManagement sınıfı, aldığı BaseClass türündeki nesne üzerinden 
 connectToDatabase metodunu çağırarak bağlantıyı gerçekleştirmektedir.
 */
