
public class Main {
	
	public static void main(String[] args) {
		
	// Inheritance = the process where one class acquires
	//				 the attributes and methods of another.

	// car has access to methods in the Vehicle class
	Car car = new Car();
	car.go();
	// car has access to Vehicle attributes
	System.out.println(car.speed);
	// car has its unique attribute of doors
	System.out.println(car.doors);
	
	// bicycle has access to methods in Vehicle class
	Bicycle bicycle = new Bicycle();
	bicycle.stop();
	// Bicycle has access to Vehicle attributes
	System.out.println(bicycle.speed);
	// bicycle has its unique attribute of peddles
	System.out.println(bicycle.peddles);
	
	}
}
