package package2;

import package1.*;

public class C {
	
	
	// Anything that uses the public access modifier is visible to everything in the 
	// project folder.
	public String publicMessage = "This is public. public access modifier";
	
	// Anything in package2 will have access to this message. No access modifier
	// only visible to other classes in the same package
	String defaultMessage = "This is the default. No access modifier";

	// is accessible to a different class in a different package, as long as that class
	// is a subclass of whatever class contains this protected member.
	// protected String protectedMessage = "This is protected";
	
	// private is only accessible within the class itself
	//	private String privateMessage = "This is private";
}
