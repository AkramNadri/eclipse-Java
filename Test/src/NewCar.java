
public class NewCar {

	String make = "Audi";
	String model = "S5";
	String color = "Black";
	int year = 2021;
	
	
	// overriding toString method
	// when we use this method on objects, it will return and print custom string
	// returns all of the attributes of an object.
	public String toString() {
		
		// we create a variable with a custom string print
		String myString = make + "\n" + model + "\n" + color + "\n" + year;
		return myString;
		
		// Test 
	}
}
