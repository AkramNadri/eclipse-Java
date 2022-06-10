import java.util.ArrayList;

public class Main {
	
	
//	public static void main(String[]args) {

		// String = a reference data type that can store one or more 
		// 			characters reference data types have access to 
		//			useful methods.
		
		
//		String name = "Bro";
		
//		boolean result = name.equalsIgnoreCase("Bro");
//		int result = name.length();
//		char result = name.charAt(1);
//		int result = name.indexOf("o");
//		boolean result = name.isEmpty();
//		String result = name.toUpperCase();
//		String result = name.trim();
//		String result = name.replace("o", "a");
		
		
//		System.out.println(result);
		
		
//	}

	
	
	
////////////////////////////////////////////////////////////
	
	
	// Wrapper class = provides a way to use primitive data
	// types as reference data types.
	
	// reference data types contain useful methods
	// can be used with collections (ex. ArrayList)
	
	
	// Primitive		// Wrapper
	// -------			// -------
	// boolean			Boolean
	// char				Character
	// int				Integer
	// double			Double
	// many more...
	
	// autoboxing = the automatic conversion that the Java
	// compiler makes between the primitive data types and 
	// their corresponding object wrapper class
	
	// unboxing = the reverse of autoboxing. Automatic conversion
	// of wrapper class to primitive.
	
	// Example of wrapper class
	// autoboxing by placing primitives into wrapper class
//	Boolean a = true;
//	Character b = '@';
//	Integer c = 123;
//	Double d = 3.14;
//	String e = "Bro";
//	
//	// now we have access to methods to these wrapper class variables
//	
//	// example a now has access to methods
//	System.out.println(a.booleanValue());
//	
//	// d has access to methods
//	System.out.println(d.byteValue());
//	
//	// example of unboxing, 
//	if(a==true) {
//		System.out.println("This is true");
//	}
	
	
	
////////////////////////////////////////////////////////////

	// ArrayList = a resizable array.
	// Elements can be added and removed after compilation phase
	// store reference data types
	
		
	// <> data type 
//	ArrayList<String> food = new ArrayList<String>();
//	
//	food.add("Pizza");
//	food.add("burger");
//	food.add("pasta");
//	
//	food.set(0, "sushi");
//	food.remove(2);
//	food.clear();
//
//	for(int i = 0; i < food.size(); i++) {
//		System.out.println(food.get(i));
//	}
	
	
////////////////////////////////////////////////////////////

	// 2D ArrayList = a dynamic list of lists. A list of seperate lists.
	// You can change the size of these lists during runtime.
		
	// wrapper class String
//	ArrayList<String> bakeryList = new ArrayList<>();
//	bakeryList.add("Pasta");
//	bakeryList.add("garlic bread");
//	bakeryList.add("donuts");
//		
//	ArrayList<String> produceList = new ArrayList<>();
//	produceList.add("tomatoe");
//	produceList.add("lettuce");
//	produceList.add("cucumber");
//	
//	ArrayList<String> drinksList = new ArrayList<>();
//	drinksList.add("coke");
//	drinksList.add("pepsi");
//	
//	System.out.println(bakeryList);
//	System.out.println(produceList);
//	System.out.println(drinksList);
//	
//	
//	// Create a 2D ArrayList to contain all these lists.
//	ArrayList<ArrayList<String>> groceryList = new ArrayList();
//
//	// Add lists to 2D ArrayList
//	groceryList.add(produceList);
//	groceryList.add(bakeryList);
//	groceryList.add(drinksList);
//	
//	// print all the lists in the 2D ArrayList
//	System.out.println(groceryList);
//	
//	// print the first list in the ArrayList
//	System.out.println(groceryList.get(0));
//	
//	// prints the index(1) value inside the index list of (0)
//	System.out.println(groceryList.get(0).get(1)); // lettuce
	
	
////////////////////////////////////////////////////////////

	// for-each = traversing technique to iterate through
	// the elements in an array/collection
	// less steps/ more readable
	// less flexible
		
//	String [] animals = { "Cat", "dog", "bird", "lizard"};
	
//		ArrayList<String> animals = new ArrayList<String>();
//		
//		animals.add("Dog");
//		animals.add("rat");
//		animals.add("bird");
//		
//		
//	// enhanced for loop
//		// everything in animals will be placed into animal.
//	for(String animal : animals) {
//		System.out.println(animal);
//	}
		
		
////////////////////////////////////////////////////////////

	// Method = a block of code that is executed whenever 
	// it is called.
		
//	int x = 2;
//	int y = 4;
//	
//	
//		System.out.println(addTwoNumbers(x, y));
//	
//	
//		//int is the return type
//		static int addTwoNumbers(int x, int y) { 
//			
//			int sum = x + y;
//			return sum;
//		}
	
	
////////////////////////////////////////////////////////////

	
	// Overloaded methods - methods that share the same mane but have different
	// parameters. Method name + parameters = method signature.
	
	
		// calling overloaded methods
//		int x = add(1, 2); // will call method 1
//		int z = add(1, 2, 3); // overloaded method 2
//		int y = add(1, 2, 3, 4); // overloaded method 3
//		
//		
//		// this will call the double add method 2, because there are 3 arguments
//		double d = add(1.0, 2.0, 3.0);
//		
//		// both methods have the same name
//		static int add(int a, int b) {
//			System.out.println("This is overloaded method 1");
//			return a + b;
//		}
//		
//		// either we have to change the name of the method, or change parameters
//		// here we added a 3rd argument to the parameters
//		static int add(int a, int b, int c) {
//			System.out.println("This is overloaded method 2");
//			return a + b + c;
//		}
//	
//		// here we add 4 arguments in parameter
//		static int add(int a, int b, int c, int d) {	
//			System.out.println("This is overloaded method 3");
//			return a + b + c + d;
//		}
//		
//		// number of arguments and datatype = overloaded methods
//		// same name, but using double data type
//		static double add(double a, double b) {	
//			System.out.println("This is overloaded method 3");
//			return a + b + c + d;
//			}
//		// double overloaded method 2
//		static double add(double a, double b, double c) {	
//			System.out.println("This is overloaded method 3");
//			return a + b + c + d;
//			}
//		// double overloaded method 3
//		static double add(double a, double b, double c, double d) {	
//			System.out.println("This is overloaded method 3");
//			return a + b + c + d;
//			}
		
////////////////////////////////////////////////////////////

		// printf() = an optional method to control, format, and display text to
		// the console window. Two arguments = format string + (object/variable/value)
		// % [flags] [precision] [width] [conversion-character]
		// % = format specifier
		// %'d' = the d after the % corresponds to datatype of the value we are adding.
		
		
//		boolean myBoolean = true;
//		char myChar = '@';
//		String myString = "Bro";
//		int myInt = 50;
//		double myDouble = 1000;
//
//		// by adding %d - format specifier we can now print the 1234 as a string
//		// the 1234 will be displayed whereever the format specifier is placed.
//		// 1234 will be displayed at the end of this string
//		System.out.printf("format specifier after string %d \n", 1234);
//	
//		System.out.println("");
//		// 1234 will be displayed at the beginning of this string
//		System.out.printf("%d format specifier before string \n", 1234);
//
//		// % 'b' = boolean
//		System.out.printf("%b \n", myBoolean);
//
//		// % 'c' = char
//		System.out.printf("%c \n", myChar);
//
//		// % 's' = char
//		System.out.printf("%s \n", myString);
//		
//		// % 'd' = decimal/integer
//		System.out.printf("%d \n", myInt);
//	
//		// % 'f' = floating point numbers/double values
//		System.out.printf("%f \n", myDouble);
//	
//		
//		// [width]
//		// minimum number of characters to be written as output
//		// this will print a minimum of 10 spaces, as specified after the specifier.
//		System.out.printf("Hello %10s \n", myString);
//	
//	
//		// [precision]
//		// sets number of digits of precision when outputting floating-point values
//		// we can limit the number of zeros displayed in double by specifying 
//		// how many digits we want after the decimal. Here we want 2 digits after the decimal.
//		System.out.printf("You have this much money %.2f \n", myDouble);
//	
//		
//		// [flags]
//		// adds and effect to output based on the flag added to format specifier
//		// - : left-justify
//		// + : output a plus (+) or minus (-) sign for numeric value
//		// 0 : numeric values are zero padded
//		// , : comma grouping seperator if number > 1000
//		
//		
//		// this will add the numeric value in front of the double (+), 
//		// if the number is positive it will add +, if negative will add -
//		System.out.printf("You have this much money %+f \n", myDouble);
//
//		// add a bunch of zeros before the number
//		System.out.printf("You have this much money %020f \n", myDouble);
//
//		// we can add a comma , in the one thousandths place
//		System.out.printf("You have this much money %,f", myDouble);

	
////////////////////////////////////////////////////////////

		// Final keyword - anything that is declared as final cannot be changed
		// or updated later in the program.
		
		// since were using final keyword for variable pi, we cannot change
		// its value.
		// common practice when declaring a variable as final, we use all uppercase
		// when writing the final variable.
//		final double PI = 3.14159;
//		
//		// cannot add or change value of pi, will cause error.
////		pi = 4;
//		
//		System.out.println(PI);
	
	
////////////////////////////////////////////////////////////

		// Object-oriented programming
		
		// object = an instance of a class that may contain attributes and methods
		// with objects they contain attributes and methods
		// think of attributes as the characteristics this object has
		// think of methods different actions this object can perform
		
		// an object is really a bundle of defining methods and attributes,
		// the characteristics of an object and what actions can this object perform.
		
		
	
////////////////////////////////////////////////////////////

	// Overloaded constructors = multiple constructors within a class with the same name,
	// but have different parameters
	// name + parameters = signature.
	
	
	
	
////////////////////////////////////////////////////////////

	// toString() = special method that all objects inherit
	// 				that returns a string that "textually represents" an object.
	//				can be used both implicitly and explicitly
	
	
	
	
	
////////////////////////////////////////////////////////////

	
	// Array of objects
	
//	int [] numbers = new int [3];
//	char [] characters = new char [4];
//	String [] strings = new String[5];
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
