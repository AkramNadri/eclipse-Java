
public class MainFriend {
	
	public static void main(String[] args) {
		
		// static = modifier. A single copy of a variable/method is created and shared.
		// 			The class "owns" the static member.
		
		
		// Each of these Friend objects has a copy of the static variable
		Friend friend = new Friend("Akram");
		Friend friend2 = new Friend("Moe");
		
		// numberOfFriends here is a static variable
		// Type in the name of the class that owns the static variable
		// followed by the static member that were trying to access
		System.out.println(Friend.numberOfFriends);
		
		// access the static method displayFriends
		// must first use Class name then static variable/method name
		Friend.displayFriends();
		
		
		// Another example of a static method we use all the time is Math
		// first we call the class Math, then the static variable/method
		Math.random();
	}
	

}
