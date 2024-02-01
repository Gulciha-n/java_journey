package java_basics;

public class Strings {

	public static void main(String[] args) {
		String txt = "Welcome to java";
		System.out.println(txt);
		System.out.println("lenght of txt : " + txt.length());
		System.out.println(txt.toUpperCase());
		System.out.println(txt.toLowerCase());
		System.out.println(txt.indexOf("a"));
		System.out.println(txt.lastIndexOf("a"));
		System.out.println(txt.startsWith("W"));
		System.out.println(txt.endsWith("A")); //case sensitive
		System.out.println(txt.replace(" ", "-"));
		System.out.println(txt.substring(3));
		System.out.println(txt.substring(0,3));
		
		System.out.println("--------------------");
		
		for(String word : txt.split(" ")) {
			System.out.println(word);
		}
		
		System.out.println("--------------------");
		
		//string concatenation
		String firstNameString = "Gulcihan";
		String secondName = "Batu";
		System.out.println(firstNameString + " " + secondName);
		
		//concat()method
 		String greeting1 = "Hello ";
		String greeting2 = "Java";
		System.out.println(greeting1.concat(greeting2));
		System.out.println(greeting1.concat("bro"));
		
		int x = 10;
		int y = 20;
		int z = x + y;
		System.out.println(z);
		
		
		String a = "10";
		String b = "20";
		String c = a + b;
		System.out.println(c);
		
		
		String d = "10";  // the result will be a string
		int e = 20;
		String f = d + e;
		System.out.println(f); 
		
		
		System.out.println("This is a 'java' code line");
		System.out.println("This is a \"java\" code line");
		System.out.println("This is a \\java\\ code line");
		
		
		String text = "Hello\rWorld";   // \r = overwriting
		System.out.println(text);
	}
	
}

