package vezba;

public class TestCar {

	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car();
		
		c2.setLocked(true);
		
		c2.setLocked(false);
		
		c1.addFuel(5);
		
		c1.addFuel(-5);
		
		c2.addFuel(10);
		
		double totalFuel = c1.getFuelAmount() + c2.getFuelAmount();
		System.out.println(totalFuel);
		
		c1.setLocked(c2.isLocked());
	}

}
