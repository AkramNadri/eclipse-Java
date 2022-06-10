
public class Friend {
	
	String name;
	
	// All instances of the class Friend have to share this one variable
	// if we remove the static keyword, we cannot access this variable from another class
	static int numberOfFriends; 
	
	
	Friend(String name) {
		this.name = name;
		
		// we increment each time we add a friend
		numberOfFriends++;
	}
	
	// Can also use the static keyword in a method
	static void displayFriends() {
		System.out.println("You have " +numberOfFriends+ " friends");
	}

}
