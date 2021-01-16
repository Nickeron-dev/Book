package classes;

public class Vehicle {
	private int passengers;
	private int fuelcap;
	private int mpg;
	
	Vehicle(int passengers, int fuelcap, int mpg) {
		this.passengers = passengers;
		this.fuelcap = fuelcap;
		this.mpg = mpg;
	}
	
	int range() {
		return fuelcap / mpg;
	}
	
	double fuelNeeded(int miles) {
		return (double) miles / mpg;
	}
	
	int getPassengers() { return passengers; }
	int getFuelcap() { return fuelcap; }
	int getMpg() { return mpg; }
	void setPassengers(int passengers) { this.passengers = passengers; }
	void setFuelcap(int fuelcap) { this.fuelcap = fuelcap; }
	void setMpg(int mpg) { this.mpg = mpg; }
}