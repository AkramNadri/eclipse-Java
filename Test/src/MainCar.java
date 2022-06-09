
public class MainCar {
	
	public static void main(String[] args) {
		
		// toString() = special method that all objects inherit
		// 				that returns a string that "textually represents" an object.
		//				can be used both implicitly and explicitly
		
		NewCar car = new NewCar();
		
		
		// without using the toString() method, this will only print out the car 
		// object location on memory.
 		System.out.println(car.toString());
		
		
 		// we can use the toString() method to print out all the values inside the object.
 		// but first we must override the toString method in NewCar class
		
	}

		
	
	
}
