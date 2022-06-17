package combinatorpattern;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;
import static combinatorpattern.CustomerRegistrationValidator.ValidationResult;


// interface class which takes in customer object and returns validation result.
public interface CustomerRegistrationValidator 
		extends Function<Customer, ValidationResult> {
	
	
	static CustomerRegistrationValidator isEmailValid() {
		// ternary operator, if customer.getEmail contains @ then execute first expression, else execute second expression
		return customer -> customer.getEmail().contains("@") 
				? ValidationResult.SUCCESS : ValidationResult.EMAIL_NOT_VALID;
	}
	
	// validating if customers phone number starts with specified 3 digits
	static CustomerRegistrationValidator isPhoneNumberValid() {
		return customer -> customer.getPhoneNumber().contains("613") 
				? ValidationResult.SUCCESS : ValidationResult.PHONE_NUMBER_NOT_VALID;
	}
	
	// validating if customer age is greater then 16
	static CustomerRegistrationValidator isValidAdult() {
		return customer -> Period.between(customer.getDob(), LocalDate.now()).getYears() > 16 
				? ValidationResult.SUCCESS : ValidationResult.IS_NOT_AN_ADULT;
	}

	
	default CustomerRegistrationValidator and (CustomerRegistrationValidator other) { 
		return customer -> { 
			ValidationResult result = this.apply(customer);
			return result == ValidationResult.SUCCESS ? other.apply(customer) : result;
		};
	}
	
	
	 enum ValidationResult {
		SUCCESS,
		PHONE_NUMBER_NOT_VALID,
		EMAIL_NOT_VALID,
		IS_NOT_AN_ADULT
		
	}

}
