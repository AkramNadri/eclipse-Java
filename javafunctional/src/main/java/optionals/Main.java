package optionals;

import java.util.Optional;


public class Main {

	public static void main(String[] args) {

		// .of expects a value, cannot use null or leave empty
		//		Optional<String> emptyOptional = Optional.of("Hello");

		// When you dont know if the value will be null or not us .ofNullable
		//		Optional<String> emptyOptionalNullable = Optional.ofNullable(null);
		// world will print since above is null, so will look for the next/other value
		//		System.out.println(emptyOptionalNullable.orElse("world"));

		// Imperative way - requires much more lines of code
		// Example of imperative
		//		String helloString = null;
		//		String world;
		//		
		//		if(helloString == null) {
		//			world = "world";
		//			System.out.println(world);
		//		}

		// isPresent = if a value is present returns true, otherwise false
		// true because there is a value present
		//		System.out.println(emptyOptional.isPresent());
		// If a value is not present returns true, otherwise false
		// false because it is not empty
		//		System.out.println(emptyOptional.isEmpty());

		// if value is present, will return value, else if its empty will 
		// return the other value.
		// "Hello" will be returned here since its present in emptyOptional
		//		String orElse = emptyOptional.orElse("world");
		//		System.out.println(orElse);

		//		Optional<String> hellOptional = Optional.ofNullable("Audi");

		// if value is present, performs the given action. If the value is present will
		// return true and print the found word
		//		hellOptional.ifPresent(word -> {
		//			System.out.println(word);
		//		});

		// ifPresentOrElse - if value is present will execute first block, else will execute second block
		// similar to if/else 
		//		hellOptional.ifPresentOrElse(word -> {
		//			System.out.println(word);
		//		}, () -> System.out.println("world")); 


		// ******************************************************** //
		Person person = new Person("Akram", null);
		Person person2 = new Person("Mo", "Mo@GMAIL.COM");
		
		// nullPointerException because email is null 
		// we are using .ofNullable in email getter so it will not throw nullPointer, instead will display message
		String checkEmail = person.getEmail().map(String::toLowerCase).orElse("Email not provided");
		System.out.println(checkEmail);
		
		// person2 does have email, in getter we pass email 
		String checkEmail2 = person2.getEmail().map(String::toLowerCase).orElse("Email not provided");
		System.out.println(checkEmail2);

	}

}

class Person {

	private final String name;
	private final String email;

	public Person(String name, String email) {
		this.name = name;
		this.email = email;

	}

	public String getName() {
		return name;
	}

	// Emails can be null which may trigger a nullPointerException
	// We wrap this is optional
	public Optional<String> getEmail() {
		return Optional.ofNullable(email);
	}

}
