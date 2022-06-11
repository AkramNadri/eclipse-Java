package package1;

import package2.*;


// All of our classes are public, which means they are all visible to one another within
// the same project folder.
// Example: class A, B , C , D are all public and within the same project folder, so they
// are all visible/accessible to each other.
public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		C c = new C();
		
		// defaultMessage is not visible here because it is not in the same package
//		System.out.println(c.defaultMessage);
		
		// publicMessage is visible to any package within the same project folder
//		System.out.println(c.publicMessage);
		
	
		
//		is accessible to a different class in a different package, as long as that class
// 		is a subclass of whatever class contains this protected member.
//		protected String protectedMessage = "This is protected";
		
		B b = new B();
		// privateMessage is not visible in class A, only visible in class B where it is 
		// contained
//		System.out.println(b.privateMessage);

	}

}
