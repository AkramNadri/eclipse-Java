package functionalinterface;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {


	// Supplier<T> = represents a supplier of results.
	public static void main(String[] args) {

		System.out.println(getDBConnectionURL());

		// use .get() to retrieve value from Supplier
		System.out.println(getDBConnectionURLSupplier.get());
		System.out.println(getDBConnectionURLSuppliers.get());

		
	}

	// normal function
	static String getDBConnectionURL() {
		return "jdbc://localhost:5432/users";
	}


	// Supplier function
	// returns any kind of value we want
	// = () -> , this will take any argument
	static Supplier<String> getDBConnectionURLSupplier = () 
			-> "jdbc://localhost:5432/users"; 

	// Example of supplier taking List
	// returning a List with 2 URLS
	static Supplier<List<String>> getDBConnectionURLSuppliers = () 
			-> List.of("jdbc://localhost:5432/users", 
					"jdbc://localhost:5432/customer"); 

}
