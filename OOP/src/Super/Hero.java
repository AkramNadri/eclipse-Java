package Super;

// Hero extends Person class, Hero is the child class of Person
// Hero inherits all attributes and methods of Person
public class Hero extends Person {

	String power;
	
	Hero(String name, int age, String power) {

		// Hero is child class of Person class, super for name
		// and age points to the parent class constuctor.
		// Since power is not included in the parent class constructor
		// we must implicitly state it in child class constructor
		super(name, age); // name and age point to parent constructor
		
		// "this" refers to this class that were in
		this.power = power; 
	}
	
	// toString method to display custom string of Hero object
	// we use super to print name and age by using the parent class
	// we add +this.power to add power to the parent class toString method
	public String toString() {
		return super.toString()+this.power;
	}
}
