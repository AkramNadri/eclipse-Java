package optionals;

import java.util.Optional;

public class Main2 {

	public static void main(String[] args) {

		// .ofNullable returns a value, if null returns empty optional
		//		Object value = Optional.ofNullable(null)
		// .orElseGet if value present will return value, otherwise return value in above function
		// above .orElseGet is known as the supplying function
		//		.orElseGet(() -> "default value" ); 

		//		System.out.println(value);

		// .orElseThrow - if value is present return value, otherwise throws exception
		Object value = Optional.ofNullable("No exception")
				.orElseThrow(() -> new IllegalStateException("Exception"));

		System.out.println(value);

	}

}
