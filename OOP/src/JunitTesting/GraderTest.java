package JunitTesting;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GraderTest {
	
	@Test
	void zeroShouldReturnF() {
		Grader grader = new Grader();
		
		assertEquals('F', grader.determineLetterGrade(0));
	}

	@Test
	void fiftyNineShouldReturnF() {
		// Create Grader object so that we can call determineLetterGrade method on it
		Grader grader = new Grader();
		
		// Expecting grade of 'F' when passing in the grade of 59
		assertEquals('F', grader.determineLetterGrade(59));
	}
	
	
	@Test
	void sixtyNineShouldReturnD() {
		Grader grader = new Grader();
		
		assertEquals('D', grader.determineLetterGrade(69));
	}
	
	@Test
	void seventyNineShouldReturnC() {
		Grader grader = new Grader();
		
		assertEquals('C', grader.determineLetterGrade(79));
	}
	
	@Test
	void eightyNineShouldReturnB() {
		Grader grader = new Grader();
		
		assertEquals('B', grader.determineLetterGrade(89));
	}
	
	@Test
	void aboveNinetyShouldReturnA() {
		Grader grader = new Grader();
		
		assertEquals('A', grader.determineLetterGrade(90));
	}
	
	@Test
	void shouldThrowException() {
		Grader grader = new Grader();
		// Here we are testing throw exception
		assertThrows(IllegalArgumentException.class, 
				
				// Use lambda, calling the method with a number less then 0
				// should throw IllegalArgumentException
				() -> {  grader.determineLetterGrade(-1);
		});

				
	}

}
