
public class Main {
	
	public static void main(String[] args) {
		
	// method overriding = declaring a method in sub class,
	// 					   which is already present in parent class.
	//					   done so that a child class can give its own implementation.

	
	// create a new dog object
	Dog dog = new Dog();
	
	// create a new Animal object
	Animal animal = new Animal();
	
	// this will use the speak() method found in Dog class, since it overriding 
	dog.speak();
	
	// this will use the speak() method found in Animal class
	animal.speak();
	
	
	
	}
}
