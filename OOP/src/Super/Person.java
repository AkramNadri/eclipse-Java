package Super;

public class Person {

	
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;

	}
	
	// toString method to display custom string of Hero object
		public String toString() {
			String message = "Hero name:" + name+" Hero age:" + age +" Hero power:";
			return message;
		}
}
