//import java.util.Random;
//
//public class DiceRoller {

	
	// EXAMPLE 1 of how to use local variables **********************
	
	// constructor
	// random and number are local only to this contructor, which means only this constructor 
	// can use these variables. 
//	DiceRoller() {
//		Random random = new Random();
//		int number = 0;
//		
//		// to use the local variables we need to pass them as arguments into the roll method
//		roll(random, number);
//	}
	
	// a method to roll the dice
	// this method is unable to use/access number varable currently because it is inside the constructor
	// we must declare the variables as global variables in order to use within the class
	// to use the variables in the constructor method we passed in the variables as arguments
	// into the roll method, now we have to create parameters in roll method to accept those
	// arguments
//	void roll(Random random, int number) {
//		number = random.nextInt(6+1);
//		System.out.println(number);
//	}
	
	
	
	
	// EXAMPLE 2 of how to use local/global variables ************************
	
	// We declare our variables outside the methods, now the entire class has access to these variables
	// now considered global variables
	
//	Random random;
//	int number;
//	
//	//constructor
//	DiceRoller() {
//		random = new Random();
//		roll();
//	}
//	
//	void roll() {
//		number = random.nextInt(6)+1;
//		System.out.println(number);
//	}
//}
