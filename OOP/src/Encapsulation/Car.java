package Encapsulation;

public class Car {

	// All these variables are private, so only this class has access
	private String make;
	private String model;
	private int year;

	public Car(String make, String model, int year) {
		// we are using the Setters to set the values 
		this.setMake(make);
		this.setModel(model);
		this.setYear(year);

		// Since we are setting these values in the Setters 
		// we dont need to do this in the constructor.
		//    	this.make = make;
		//    	this.model = model;
		//    	this.year =year;

	}

	// to access these private attributes we create getter methods
	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public int getYear() {
		return year;
	}

	// How to change the attributes of private variables
	// Setters to set the attributes of private variables
	// must pass in the variable as argument
	// We can use these setter methods in other classes to change the values
	public void setMake(String make) {
		this.make = make;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setYear(int year) {
		this.year = year;
	}

}
