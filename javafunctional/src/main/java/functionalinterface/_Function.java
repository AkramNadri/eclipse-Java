package functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

	public static void main(String[] args) {
		//		int increment = incrementByOne(0);
		//		System.out.println(increment);

		// calling the function, apply takes in the argument
		// Takes one argument
		int incrementFunction = incrementByOneFunction.apply(4);
		System.out.println(incrementFunction);

		int multiplyFunction = multiplyBy10.apply(10);
		System.out.println(multiplyFunction);

		int addThenMultiple = addByOneThenMultiplyBy10.apply(5);
		System.out.println(addThenMultiple);
		
		// BiFunction
		// takes two arguments
		int biFunctionTwoArguments = incrementByOneAndMultipleBiFunction.apply(2, 10);
		System.out.println(biFunctionTwoArguments);
	}

	// New way of creating function - functional style - same as below
	// T = input, R = return type
	// -> lambda function
	// number = parameter
	static Function<Integer, Integer> incrementByOneFunction 
	= number -> number + 1; 

	// Function that takes in one argument and multiplies value by 10
	static Function<Integer, Integer> multiplyBy10 = number -> number * 10;

	// Combine 2 functions with .andThen()
	// Chain functions with .andThen()
	static Function<Integer, Integer> addByOneThenMultiplyBy10 = 
			incrementByOneFunction.andThen(multiplyBy10);

	// BiFunction - accepts 2 arguments and produces results
	// Since this function takes 2 arguments, we wrap the arguments in parenthesis
	static BiFunction<Integer, Integer, Integer> incrementByOneAndMultipleBiFunction =
			(numberToIncrementByOne, numberToMultiplyBy) 
			-> (numberToIncrementByOne + 1) * numberToMultiplyBy;
	
	
	
	// Original function
	//	static int incrementByOne(int number) {
	//		return number + 1;
	//	}

}
