
public class Car {
	
	// Attributes of the Car class
	String make;
	String model;
	String color;
	int year;
	double price;
	
	
	// Constructor = a special method that is called when an object is instantiated (created)
	// this constructor will allow us to create multiple objects 
	Car(String make, String model, String color, int year, double price) {
		this.make = make;
		this.model = model;
		this.color = color;
		this.year = year;
		this.price = price;
	}
	
	// Methods of the Car class
	void drive() {
		System.out.println("Your driving the " + this.make + " " + this.model);
	}
	
	void brake() {
		System.out.println("You are braking in the " + this.make + " " + this.model);
	}

	public static void main(String[] args) {
		
		// Creating a myCar object using the Car class
		Car myCar1 = new Car("Audi", "S5", "Black", 2018, 40000);

		// creating another object using the same constructor
		Car myCar2 = new Car("BMW", "M5", "Blue", 2020, 75000);

		
		// displaying the attributes of car object
		System.out.println(myCar1.make);
		
		System.out.println(myCar2.make);

	
		// Calling methods in the Car class
		myCar1.drive();
		
		myCar2.brake();
	}
	

}
