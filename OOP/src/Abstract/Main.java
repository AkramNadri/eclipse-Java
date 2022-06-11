package Abstract;

public class Main {
	
	public static void main(String[] args) {
		
		// abstract =	abstract classes cannot be instantiated, but they can have subclass
		//				abstract methods are declared without an implementation.
		
		Car car = new Car();
		
		// since Vehicle class is abstract we cannot instantiate an object using this class
//		Vehicle vehicle = new Vehicle();
		
		
		car.go();
	}

}
