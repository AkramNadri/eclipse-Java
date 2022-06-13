package Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		// exceptions = an event that occurs during the execution of a program,
		//				disrupts the normal flow of instructions.
		// A way to handle exceptions without the program crashing.

		// use a try/catch to surround code blocks that can crash
		try {

			System.out.println("Enter a whole number to divide: ");
			int x = scanner.nextInt();

			System.out.println("Enter a whole number to divide by: ");
			int y = scanner.nextInt();

			int z = x/y;

			// if we divide a number by 0 it will cause an ArithmeticException
			// and the program will crash.
			System.out.println("Result = " + z);
		} 
		
		// here we can catch the exception and log it without
		// the program crashing.
		catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("Cannot divide by 0");	
		}
		
		// if user inputs incorrect data type ex. String instead of int
		catch (InputMismatchException e) {
			e.printStackTrace();
			System.out.println("Input must be integer only");
		}
		
		// Exception = will catch all exceptions
		catch (Exception e) {
			System.out.println("Something went wrong, any exception");
		}
		
		// Always execute whether or not we catch an exception
		// Also used to close any scanners or files that are open
		finally {
			scanner.close();
			System.out.println("This will always print");
		}
	}

}
