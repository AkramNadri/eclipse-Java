
public class Garage {
	
	
	// Method
	// Passing an object to this method
	// must setup the method to take in object data type in order to pass in objects
	// in this case CarGarage is the datatype
	// can only pass in objects that have been specified in the parameters
	void park(CarGarage car) {
		System.out.println("The " + car.name + " is parked in the garage");
	}

}
