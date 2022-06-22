package Generics;


// This class is designed to only take integer values
// What if we wanted to print a different data type like double or float etc...?
// We would have to create an entirely new class for each data type

// *** Generics allow you to have 1 class that is flexible for many types ***

// to turn this class into a generic class we need to use the "type parameter" 
// type parameter = <> placed after the class name. 
// inside the type parameter we can name it anything, but by convention we name it T
// T represents the type of thing that this printer is going to be able
// to hold and print.

public class Printer <T> {
	
	// "T" represents the type of thing that this printer is going to be able
	// to hold and print.
	T thingToPrint;
	
	public Printer(T thingToPrint) {
		this.thingToPrint = thingToPrint;
		
		
	}
	
	public void print() {
		System.out.println(thingToPrint);
	}
	

}
