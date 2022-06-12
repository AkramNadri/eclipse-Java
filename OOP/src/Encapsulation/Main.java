package Encapsulation;

public class Main {

	public static void main(String[] args) {

		// Encapsulation = attributes of a class will be hidden or private,
		//				   Can be accessed only though methods (getters & setters)
		//				   You should make attributes private if you dont have a reason to make them public

		// getter method - to retrieve a private variable from another class
		// setter method - to change/set the value of a private variable from another class 
		
		Car car = new Car("Audi", "A5", 2018);
		
		// Attempt to print the private car make.
//		System.out.println(car.make); // Car.make is not visible
		
		// since we created getters for the attributes, we now have access to them 
		// through getter method.
		System.out.println(car.getMake());
		System.out.println(car.getModel());
		System.out.println(car.getYear());
		
		
		// Attempt to change the year attribute in car
		// since year is a private variable in Car class we do not have access to it
//		car.year = 2022;
		
		// We can now change the value of the private variables by using the setter method
		car.setMake("BMW");
		car.setModel("M3");
		car.setYear(2022);
		
		System.out.println(car.getMake());
		System.out.println(car.getModel());
		System.out.println(car.getYear());
		
	}

}
