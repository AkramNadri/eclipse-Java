package Interface;

// to implement and interface into the class use "implements" keyword
public class Rabbit implements Prey {

	
	// when implementing from an interface class we must implement the methods from the interface class
	@Override
	public void flee() {
		System.out.println("the rabbit is fleeing");
		
	}

}
