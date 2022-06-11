package package1;

import package2.*;

public class B {
	
	// private is only visible to the class it contains itself, only class B has access
	// to this private message.
	// its only visible to the class itself, even if its in the same package
	private String privateMessage = "This is private";


}
