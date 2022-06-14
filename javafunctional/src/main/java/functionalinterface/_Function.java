package functionalinterface;

import java.util.function.Function;

public class _Function {
	
	public static void main(String[] args) {
//		int increment = incrementByOne(0);
//		System.out.println(increment);
		
		// calling the function, apply takes in the argument
		int incrementFunction = incrementByOneFunction.apply(4);
	System.out.println(incrementFunction);
	}

	// New way of creating function - functional style - same as below
	// T = input, R = return type
	// -> lambda function
	// number = parameter
	static Function<Integer, Integer> incrementByOneFunction 
	= number -> number + 1; 
	
	
	// Original function
//	static int incrementByOne(int number) {
//		return number + 1;
//	}

}
