package enumsMain;

public class TrafficLightsDemo {
	public static void main(String[] args) {
		TrafficLights trafficLights = new TrafficLights();
		
		Thread thread = new Thread(trafficLights);
		thread.start();
		
		for(int i = 0; i < 9; i++) {
			System.out.println(trafficLights.getColour());
			trafficLights.waitForChange();
		}
		
		trafficLights.cancel(); 
	}
}
