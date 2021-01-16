package interfaces;

public class Vehicle implements IVehicle {
	private int passengers;
	private int fuelcap;
	private int mpg;
	
	public Vehicle(int passengers, int fuelcap, int mpg) {
		this.passengers = passengers;
		this.fuelcap = fuelcap;
		this.mpg = mpg;
	}
	
	public int range() {
		return fuelcap / mpg;
	}
	
	public double fuelNeeded(int miles) {
		return (double) miles / mpg;
	}
	
	public int getPassengers() { return passengers; }
	public int getFuelcap() { return fuelcap; }
	public int getMpg() { return mpg; }
	public void setPassengers(int passengers) { this.passengers = passengers; }
	public void setFuelcap(int fuelcap) { this.fuelcap = fuelcap; }
	public void setMpg(int mpg) { this.mpg = mpg; }
}