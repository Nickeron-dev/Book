package interfaces;

public class Truck extends Vehicle {
	private int canCarry;
	
	public Truck(int passengers, int fuelcap, int mpg, int canCarry) {
		super(passengers, fuelcap, mpg);
		this.canCarry = canCarry;
	}
	
	public void getCanCarry() {
		System.out.println("Cancarry: " + canCarry);
	}
}
