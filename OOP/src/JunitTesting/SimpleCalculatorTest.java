package JunitTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SimpleCalculatorTest {

	
	// Unit test should only test one thing/ one single scenario
	// naming convention for test: should be very descriptive of the exact scenario.
	// and what the results should be
	@Test
	void twoPlusTwoShouldEqualFour() {
		// inside the test method we want to call the method
		// create SimpleCalculator object
		SimpleCalculator calculator = new SimpleCalculator();
		// Here we call the method and pass in argument
		// this add method will return a result, we want to confirm its returning
		// the correct result.
		// Assert statement is used for verification.
		
		// First parameter is the value that we expect the results should be
		// Second parameter is the actual result of the test.
		// Here we expect result of 4 when calling add method with 2 + 2.
		assertEquals(4, calculator.add(2, 2));
		// We want to verify or "Assert" that this method will return 4.
		
	}
	
	// Further tests and verification on SimpleCalculator
	@Test
	void threePlusSevenShouldEqualTen() {
		SimpleCalculator calculator = new SimpleCalculator();
		// Expected result is 10 from adding 3 + 7.
		assertEquals(10, calculator.add(3, 7));
	}

}
