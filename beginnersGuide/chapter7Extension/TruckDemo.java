package classes;
import java.io.*;

public class TruckDemo {
	public static void main(String[] args) {
		Truck semi = new Truck(23, 345, 20, 1000);
		Truck pickup = new Truck(12, 456, 40, 3000);
		PrintWriter pw = new PrintWriter(System.out, true);
		
		double gallons;
		int distance = 125;
		
		gallons = semi.fuelNeeded(distance);
		
		pw.println("Semi can carry: " + semi.getCargo() + " kg.");
		pw.println("And bring it on distance: " + distance + " with " +
			+ gallons + " gallons.");
		
		gallons = pickup.fuelNeeded(distance);
		
		pw.println("Pickup can carry: " + pickup.getCargo() + " kg.");
		pw.println("And bring it on distance: " + distance + " with using" +
			+ gallons + " gallons.");
	}
}