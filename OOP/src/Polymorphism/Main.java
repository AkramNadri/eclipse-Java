package Polymorphism;

public class Main {

	public static void main(String[] args) {

		// polymorphism = greek word for poly - "many", morph - "form"
		// 				  The ability of an object to identify as more than one type

		// All these objects identify as Vehicles
		// They are all child classes of Vehicle
		Car car = new Car();
		Bicycle bicycle = new Bicycle();
		Boat boat = new Boat();
		
		// Or -- first use parent class name, followed by object name, than sub-class.
		
		Vehicle car1 = new Car();
		Vehicle bicycle1 = new Bicycle();
		Vehicle boat1 = new Boat();
		
		// Attempt to store all objects into one array
		// We can only store Car objects into racers
//		Car [] racers = {car, bicycle, boat};
		
		// we can only store Bicycle objects into bicycle1
//		Bicycle [] bicycles1 = {car, bicycle, boat};
		
		// can only store Boat objects into boat1
//		Boat [] boat1 = {car, bicycle, boat};
		
		// to solve the issue above we us polymorphism
		// one thing all these objects have in common is they are all Vehicles(extends Vehicle)
		Vehicle [] racers = {car, bicycle, boat};

		
		// iterate once through all elements of racers
		// enhanced for loop
		// Everything in racers will loop and go into x
		// each object that is iterated will invoke the go() method in their class
		for(Vehicle x : racers) {
			x.go();
		}
	}

}
