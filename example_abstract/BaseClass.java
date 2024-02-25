package example_abstract;

public abstract class BaseClass {
	
	public void uNamePsswrd(String uname , String psswd) {
		
		System.out.println("Uname : "+ uname + " " + "Password : " + psswd);
	}
	
	public abstract void connectToDatabase(); 
	
}
