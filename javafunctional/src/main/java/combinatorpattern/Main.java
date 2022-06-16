package combinatorpattern;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {

		Customer customer = new Customer
				("Akram", "Akram@gmail.com", 
						"6137008223", LocalDate.of(1984, 05, 01));


		CustomerValidatorService validatorService = new CustomerValidatorService();
		System.out.println(	validatorService.isValid(customer)); // true

		
		// if valid, we can store customer in db
	}

}
