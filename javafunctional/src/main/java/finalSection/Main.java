package finalSection;

import java.io.Console;
import java.util.function.Consumer;

public class Main {

	public static void main(String[] args) {


		// 3rd argument here is a callback function, if last name is null will trigger the callback functions
		hello("john", null, value -> {
			System.out.println("No last name provided " + value);
		});

		// Using runnable
		hello2("john", null, () -> {
			System.out.println("No last name provided ");
		});

	}

	// Consumer is a callback function, if last name is null will trigger callback
	static void hello(String firstName, String lastName, Consumer<String> callback) {
		System.out.println(firstName);

		if(lastName != null) {
			System.out.println(lastName);
		} else {
			callback.accept(firstName);
		}
	}

	// Same as above, except using runnable
	static void hello2(String firstName, String lastName, Runnable callback ) {
		System.out.println(firstName);

		if(lastName != null) {
			System.out.println(lastName);
		} else {
			callback.run();
		}
	}









	// Example of callback in JavaScript ********************

	//		function hello(firstName, lastName, callback) {
	//			Console.log(firstName);
	//			if (lastName) {
	//				Console.log(lastName)
	//			} else {
	//				callback();
	//			}
	//		}


}
