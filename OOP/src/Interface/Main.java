package Interface;

public class Main {

	public static void main(String[] args) {

		
		// interface = a template that can be applied to a class.
		// 			   similar to inheritance, but specifies what a class has/must do.
		//			   classes can apply more than one interface, inheritance is limited to 1 super
		
		// Create an interface, File, New, Interface.
		
		// Rabbit implements Prey interface
		Rabbit rabbit = new Rabbit();
		// Hawk implements Predator interface
		Hawk hawk = new Hawk();
		
		// Fish implements both Predator and Prey interfaces
		Fish fish = new Fish();
		
		fish.flee();
		fish.hunt();
		
		System.out.println();
		
		rabbit.flee();
		hawk.hunt();
		

	}

}
