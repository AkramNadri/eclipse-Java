package Interface;

public class Hawk implements Predator {

	// since Hawk class implements from Predator interface we must implement methods from Predator interface
	@Override
	public void hunt() {
		System.out.println("The hawk is hunting");
		
	}
	


}
