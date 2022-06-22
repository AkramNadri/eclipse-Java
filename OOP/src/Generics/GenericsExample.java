package Generics;

import java.util.ArrayList;

import Dynamicpolymorphism.Cat;
import Dynamicpolymorphism.Dog;

public class GenericsExample {
	
	public static void main(String[] args) {
		
		// Generics allow you to have 1 class that is flexible for many types
		
		// How we specify what data type we want to use ?
		// After Printer use angle <> brackets, and inside specify the data type 
		// This tell Java i want a printer for Integers
		// also after new Printer, we place angle brackets <> but do not need to specify the data type in these brackets
		// This Integer we specified here will be passed to the T type in Printer class 
		// We can only pass in the specified data type, here we set type as Integer so we cannot
		// use Double, float, String... etc.
		Printer<Integer> printer = new Printer<>(123);
		printer.print();
		
		// We use the same Printer, except pass in double 
		Printer<Double> doublePrinter = new Printer<Double>(12.9);
		doublePrinter.print();
		
		
		// Same printer class to print String
		Printer<String> stringPrinter = new Printer<String>("Hello");
		stringPrinter.print();
		
		// Can not use primitive type with Generics, must use wrapper class ex. Integer = int.
//		Printer<int> primitivePrinter = new Printer<int>(123);
		
		
		// Here we are creating an arraylist of object Cats in parameter
//		ArrayList<Cat> cats = new ArrayList<>();
//		cats.add(new Cat()); // will work 
//		cats.add(new Dog()); // will not work, only accepts Cat objects.
	}

}
