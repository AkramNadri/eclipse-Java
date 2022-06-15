package functionalinterface;

import java.util.function.Predicate;

public class _Predicate {

	public static void main(String[] args) {
		
		
//		System.out.println(isPhoneNumberValid("07987654321")); // true
//		System.out.println(isPhoneNumberValid("00987654321")); // false
		
		// to use this predicate we need .test
		System.out.println(isPhoneNumberValidPredicate.test("07987654321")); // true
		System.out.println(isPhoneNumberValidPredicate.test("00987654321")); // false
		
		// chaining predicates with .and, to finalize predicates we end with .test
		// with .and both conditions must be true
		System.out.println(isPhoneNumberValidPredicate.and(containsNumber3).test("07987654321")); //true
		System.out.println(isPhoneNumberValidPredicate.and(containsNumber3).test("07987654221")); // false
		
		// chaining predicates with .or, only one of the arguments must be true
		// .or only one condition needs to be true
		System.out.println(isPhoneNumberValidPredicate.or(containsNumber3).test("07987654221")); // true
		System.out.println(isPhoneNumberValidPredicate.or(containsNumber3).test("00987654221")); // false

	}
	
	
	// normal function - simple phone number validation
//	static boolean isPhoneNumberValid(String phoneNumber) {
//		return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
//	}
	
	
	// Predicate - same as above 
	// String is the data type 
	static Predicate<String> isPhoneNumberValidPredicate = 
			phoneNumber -> phoneNumber.startsWith("07") && phoneNumber.length() == 11;
			
			
	static Predicate<String> containsNumber3 = phoneNumber -> phoneNumber.contains("3");
}
