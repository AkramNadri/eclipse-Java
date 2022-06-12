package CopyObject;

public class Car {

	// All these variables are private, so only this class has access
	private String make;
	private String model;
	private int year;
	
	// constructor
	Car(String make, String model, int year) {
		this.setMake(make);
		this.setModel(model);
		this.setYear(year);
	}
	
	// Copy constructor
	Car(Car x) {
		this.copy(x);
	}

	// getters - read only
	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public int getYear() {
		return year;
	}


	// setters - write only
	public void setMake(String make) {
		this.make = make;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	// create a copy method to copy objects
	public void copy(Car x) {
		// this. will point to the object that was passed into
		// the argument. 
		this.setMake(x.getMake());
		this.setModel(x.getModel());
		this.setYear(x.getYear());
	}
}

