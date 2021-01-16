package interfacesMain;

public class TruckMain {
	public static void main(String[] args) {
		interfaces.Truck truck = new interfaces.Truck(20, 24, 5, 6);
		interfaces.Vehicle vehicle = truck;
		truck.getCanCarry();
		System.out.println(vehicle.range());
	}
}
