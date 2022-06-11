package Abstract;

public class Main {
	
	public static void main(String[] args) {
		
		// abstract =	abstract classes cannot be instantiated, but they can have subclass
		//				abstract methods are declared without an implementation.
		
		
		
//		Abstraction is a process of hiding the implementation details and showing only functionality to the user.
//		Another way, it shows only essential things to the user and hides the internal details, for example, 
//		sending SMS where you type the text and send the message. You don't know the internal processing 
//		about the message delivery.
		
//		Abstraction lets you focus on what the object does instead of how it does it.
		Car car = new Car();
		
		// since Vehicle class is abstract we cannot instantiate an object using this class
//		Vehicle vehicle = new Vehicle();
		
		
		car.go();
	}

}
