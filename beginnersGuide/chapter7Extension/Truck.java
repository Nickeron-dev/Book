package classes;

public class Truck extends Vehicle {
	int cargocap; // amount that can take Truck
	
	Truck(int passengers, int fuelcap, int mpg, int cargocap) {
		super(passengers, fuelcap, mpg);
		this.cargocap = cargocap;
	}
	
	int getCargo() {
		return cargocap;
	}
	
	void setCargo(int cargocap) {
		this.cargocap = cargocap;
	}
	
}