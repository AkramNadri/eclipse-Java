package imperative;

import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.management.loading.PrivateClassLoader;


public class Main {

	public static void main(String[] args) {

		// define a list
		List<Person> people = List.of(
				new Person("Akram", Gender.MALE),
				new Person("Aisha", Gender.FEMALE),
				new Person("Alex", Gender.MALE),
				new Person("Alice", Gender.FEMALE));

		// Imperative Approach *****
		System.out.println("Imperative approach");
		List<Person> females = new ArrayList<>();

		// enhanced for loop, first Object type, then new variable name, 
		// then object or list of where the values are. 
		for(Person person : people) {
			if(person.gender == Gender.FEMALE) {
				females.add(person);
			}
		}
		
		for(Person female: females) {
			System.out.println(female);
		}
		
		System.out.println();
		
		
		// Declarative Approach *****
		System.out.println("Declarative approach");
		// Use streams with collections
		// we select the list of people, then use stream() function
		people.stream()
		.filter(person -> person.gender == Gender.FEMALE)
		.collect(Collectors.toList())
		.forEach(System.out::println);
		
		
		
		
		
	}

	// Person class to create person object with name and gender
	static class Person {
		// class variables - private variables only this class has access
		private final String name;
		private final Gender gender;

		// constructor
		Person(String name, Gender gender) {
			this.name = name;
			this.gender = gender;
		}

		// toString method print custom string for name and gender
		@Override
		public String toString() {
			return "Person: " + name + " gender: " + gender;
		}
		
	}

	// enum class
	public enum Gender {
		MALE, FEMALE
	};
}


