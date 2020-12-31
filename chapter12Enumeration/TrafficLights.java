package enumsMain;

public class TrafficLights implements Runnable{
	public enums.TrafficColours colourNow;
	public boolean isChanged = false;
	public boolean stopped = false;
	
	public TrafficLights(enums.TrafficColours init) {
		colourNow = init;
	}
	
	public TrafficLights() {
		colourNow = enums.TrafficColours.GREEN;
	}
	
	public void run() {
		while(!stopped) {
			try {
				switch(colourNow) {
					case RED:
						Thread.sleep(enums.TrafficColours.RED.getTime());
						break;
					case YELLOW:
						Thread.sleep(enums.TrafficColours.YELLOW.getTime());
						break;
					case GREEN:
						Thread.sleep(enums.TrafficColours.GREEN.getTime());
						break;
				}
			} catch(InterruptedException exc) {
					System.out.println("Thread interrupted");
			}
			changeColour();
		}
	}
	
	synchronized public void changeColour() {
		switch(colourNow) {
			case RED:
				colourNow = enums.TrafficColours.YELLOW;
				break;
			case YELLOW:
				colourNow = enums.TrafficColours.GREEN;
				break;
			case GREEN:
				colourNow = enums.TrafficColours.RED;
				break;
		}
		isChanged = true;
		notify();  // notify can be used only in synchronized
	}
	
	synchronized public void waitForChange() {
		try {
			while(!isChanged) {
				wait();
			}
			isChanged = false;
		} catch(InterruptedException exc) {
			System.out.println("Thread interrupted");
		}
	}
	
	synchronized public enums.TrafficColours getColour() {
		return colourNow;
	}
	
	synchronized public void cancel() {
		stopped = true;
	}
}
