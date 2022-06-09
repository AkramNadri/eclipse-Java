import org.w3c.dom.ls.LSOutput;

public class MainPizza {

	public static void main(String[] args) {
		
		Pizza pizza = new Pizza("Thick crust", "Tomato", "Mozzerala", "Veggy");
		
		
		System.out.println("Here are the ingredients of your pizza: ");
		System.out.println(pizza.bread);
		System.out.println(pizza.sauce);
		System.out.println(pizza.cheese);
		System.out.println(pizza.topping);

	
	
	
	// Since we now have 4 unique constructors we can pass a variety of arguments to each 
	// unique constructor
	
	Pizza pizza3 = new Pizza("Thin crust", "olives", "Feta");
	System.out.println("This is pizza 3, from constructor 3");
	System.out.println(pizza3.bread);
	System.out.println(pizza3.sauce);
	System.out.println(pizza3.cheese);

	
	}
}
