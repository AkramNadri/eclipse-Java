
public class MainFood {

	public static void main(String[] args) {

		// Array of objects
		
//		int [] numbers = new int [3];
//		char [] characters = new char [4];
//		String [] strings = new String[5];


		// An array to hold Food objects
//		Food [] refrigerator = new Food[3];
		
		Food food1 = new Food("Pizza");
		Food food2 = new Food("Hamburger");
		Food food3 = new Food("Hotdog");
		
		
		// Store objects into refrigerator array
		// manually inserting objects into the array
//		refrigerator[0] = food1;
//		refrigerator[1] = food2;
//		refrigerator[2] = food3;
		
		// Example 2 of inserting objects into an array
		// here we can add all the objects to the array on one line using {} .
		Food [] refrigerator = {food1, food2, food3};
		
		
		// print objects inside refrigerator array at index 0
		// this will print the location of the object on memory, 
		// unless we specify by using .name
		System.out.println(refrigerator[0].name);
		
	}

}
