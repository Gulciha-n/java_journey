package example_abstract;

public class DbManagement{
	
	BaseClass database;
	
	public DbManagement(BaseClass database) {
		this.database = database;
	}	
	
	public void connect() {
		database.connectToDatabase();
		}
	
}

