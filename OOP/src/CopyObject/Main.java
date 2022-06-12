package CopyObject;

public class Main {

	public static void main(String[] args) {

		
		Car car1 = new Car("Audi", "A5", 2018);
//		Car car2 = new Car("BMW", "M5", 2020);
		
		// copy an object during instantiation by using the Car constructor
		// this time all attributes were copied during creation/instantiation of the object
		Car car2 = new Car(car1);
		
		// create a copy method to copy objects
		// by using the copy method we copied all attributes in car1
		// into car2.
//		car2.copy(car1);
		
		
		// prints address on memory for car1 and car2
		System.out.println(car1);
		System.out.println(car2);
		
		System.out.println("");
		
		// print attributes of car1 using getter method(read only)
		System.out.println(car1.getModel());
		System.out.println(car1.getMake());
		System.out.println(car1.getYear());
		
		System.out.println("");
		
		// print attributes of car2 using getter method(read only)
		System.out.println(car2.getModel());
		System.out.println(car2.getMake());
		System.out.println(car2.getYear());
	}
	
	

}
