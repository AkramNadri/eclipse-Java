package finalSection;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Lambdas {

	public static void main(String[] args) {

		

		// 	name here is a lambda - it is the argument
		// you can place a lambda on one line if you have only one return statement
		// Since only one argument no need to use () and since only one argument no need to use { }
		Function<String,String> upperCaseName = name -> name.toUpperCase();



		// If you have to do more then one logic in lambda, you will have to use
		// the curly braces { }.
		Function<String , String> nameContains = name -> {
			if(name.contains("A")) {
				System.out.println("Name does have an A");
			} else {
				System.out.println("Name does not contain A");
			}
			return name;
		};
		
		
		// If function contains more then one argument, must place arguments 
		// in paranthesis ()
		// And since we have more then one logic occuring we use { } for body
		BiFunction<String, Integer, String> moreThenOneArgument = (name, age) -> {
			if(name.contains("A") && age >= 18) {
				System.out.println("Does contain A and older then 18");
			}
			return name + age;
		};
				
				
				
				
		
		System.out.println(upperCaseName.apply("Akram"));
		
		System.out.println(nameContains.apply("Moe"));
		
		System.out.println(moreThenOneArgument.apply("Akram", 30));
	}	
	
	
	// Pure functional programming has a set of rules to follow
	
	// - No State 
	
	// - Pure Functions
	
	// - No Side Effects
	
	// Higher Order Functions
	
	
	// * The function takes one or more functions as parameters
	
	// * The function returns another function as a result
	
}
