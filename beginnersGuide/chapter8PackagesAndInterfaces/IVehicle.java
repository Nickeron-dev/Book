package interfaces;

public interface IVehicle {
	int range();
	double fuelNeeded(int miles);
	int getPassengers();
	int getFuelcap();
	int getMpg();
	void setPassengers(int passengers);
	void setFuelcap(int fuelcap);
	void setMpg(int mpg);
}
