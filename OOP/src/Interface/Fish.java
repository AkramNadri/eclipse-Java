package Interface;


// We can apply more then one interface to a class
// We are implementing both Prey and Predator interfaces to Fish class
public class Fish implements Prey, Predator {

	// implementing hunt method from Predator interface class
	@Override
	public void hunt() {
		System.out.println("This fish is hunting");
	}

	// implementing flee method from Prey interface class
	@Override
	public void flee() {
		System.out.println("This fish is fleeing");
	}

}
