package Dynamicpolymorphism;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// dynamic polymorphism = many shapes/forms
		// dynamic = after compilation (during runtime)
		
		// ex. A corvette is a: corvette, and a car, and a vehicle, and an object

		Scanner scanner = new Scanner(System.in);
		
		// going to ask user at run time what kind of animal
		Animal animal;
		
		System.out.println("What animal do you want?");
		System.out.println("1 = Dog  or  2 = Cat");
		int choice = scanner.nextInt();
				
				
		if(choice == 1) {
			animal = new Dog();
			animal.speak();
			
		} else if(choice == 2) {
			animal = new Cat();
			animal.speak();
		} else {
			animal = new Animal();
			System.out.println("Invalid choice");
			animal.speak();
		}
	}

}
