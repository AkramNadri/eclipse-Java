
public class Pizza {

	String bread;
	String sauce;
	String cheese;
	String topping;
	
	// Overloaded constructors = multiple constructors within a class with the same name,
		// but have different parameters
		// name + parameters = signature.
	
	// constructor
	// name + arguments = signature.
	Pizza(String bread, String sauce, String cheese, String topping) {
		this.bread = bread;
		this.sauce = sauce;
		this.cheese = cheese;
		this.topping = topping;
	}
	
	// overloaded constructor, has the same name but only 3 arguments which now make this 
	// constructor unique.
	Pizza(String bread, String sauce, String cheese) {
		this.bread = bread;
		this.sauce = sauce;
		this.cheese = cheese;
	}
	
	// overloaded constructor with only 2 arguments which again make it unique
	Pizza(String bread, String sauce) {
		this.bread = bread;
		this.sauce = sauce;
	}
	
	// overloaded constructor with 1 argument
	Pizza(String bread) {
		this.bread = bread;
	}
	
	

}
