package combinatorpattern;

import java.time.LocalDate;

import combinatorpattern.CustomerRegistrationValidator.ValidationResult;

public class Main {

	public static void main(String[] args) {

		Customer customer = new Customer
				("Akram", "Akram@gmail.com", 
						"6137008223", LocalDate.of(1984, 05, 01));


//		CustomerValidatorService validatorService = new CustomerValidatorService();
//		System.out.println(	validatorService.isValid(customer)); // true

		
		// if valid, we can store customer in db
		
		
		// Using combinator pattern
		ValidationResult result = CustomerRegistrationValidator.isEmailValid()
				.and(CustomerRegistrationValidator.isPhoneNumberValid())
				.and(CustomerRegistrationValidator.isValidAdult())
				.apply(customer);
		
		System.out.println(result);
		
		if (result != ValidationResult.SUCCESS) {
			throw new IllegalStateException(result.name());
		}
	}

}
