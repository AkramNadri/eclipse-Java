package streams;

import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.w3c.dom.ls.LSOutput;




public class _Stream {

	public static void main(String[] args) {

		// define a list
		List<Person> people = List.of(
				new Person("Akram", Gender.MALE),
				new Person("Aisha", Gender.FEMALE),
				new Person("Alex", Gender.MALE),
				new Person("Bob", Gender.NONBINARY),
				new Person("Alice", Gender.FEMALE));
		
		
		// Begin a stream by selecting some sort of list
		// Collects and prints all genders, removing duplicates in people List
		Set<Gender> genders = people.stream()
				.map(person -> person.gender) // transform, creates a list of gender
				.collect(Collectors.toSet()); // collect to a set, remove duplicates
		
		System.out.println(genders);

		
		// Collects and prints all names in people List
		Set<String> names = people.stream()
				.map(person -> person.name) // transform, creates a list of gender
				.collect(Collectors.toSet());
		
		System.out.println(names);
		
		// Will print int value of each name
		 people.stream()
				.map(person -> person.name)
				.mapToInt(name -> name.length())
				.forEach(name -> System.out.println(name));

	}
	
	

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
		MALE, FEMALE, NONBINARY
	};

}
