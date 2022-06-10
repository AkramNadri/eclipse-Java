
public class MainGarage {
	
	public static void main(String[] args) {
		
		Garage garage = new Garage();
		
		// instantiating a new CarGarage object
		CarGarage car1 = new CarGarage("Audi");
		CarGarage car2 = new CarGarage("BMW");
		
		
		garage.park(car1);
		garage.park(car2);
		
	}

}
