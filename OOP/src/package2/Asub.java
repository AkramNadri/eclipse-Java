package package2;

// * Asterisk means import everything from the package
import package1.*;


// Even though Asub is in a different package then A class, since we are extending A class
// we have access to its package
public class Asub extends A {
//
//	public static void main(String[] args) {
//		
//		
//		Asub asub = new Asub();
//		
//		// since Asub is a sub class of A class, we have access to its package
//		// have access to protected members
//		System.out.println(asub.protectedMessage);
//	}
//	
}
