package vezba;

public class Car {

	private int productionYear;
	private double fuelAmount;
	private boolean locked;
	
	public boolean isLocked() {
		return locked;
	}
	
	public void setLocked(boolean locked) {
		this.locked = locked;
	}
	
	public int getProductionYear() {
		return productionYear;
	}
	
	public double getFuelAmount() {
		return fuelAmount;
	}
	
	public void addFuel(double addedFuel) {
		if (addedFuel > 0) {
			this.fuelAmount = this.fuelAmount + addedFuel;	
		}
		
	}
}
