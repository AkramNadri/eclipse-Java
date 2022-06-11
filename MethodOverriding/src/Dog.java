
// extends animal class, so now Dog class is child class of animal
// and inherits attributes and methods from Animal class.
public class Dog extends Animal {

	// method override

	// @Override is considered good practice when using overriding methods
	// it doesn't add any additional functionality
	
	// When we create an object using Dog class it will use this method
	// since it is the closest, if we did not have this override method
	// it would instead use the method found in its parent class.
	@Override 
	void speak() {
		System.out.println("The dog barks");
	}

}
