package enums;

public enum TrafficColours {
	GREEN(10000), RED(12000), YELLOW(2000);
	private int time;
	
	TrafficColours(int time) {
		this.time = time;
	}
	
	public int getTime() {
		return time;
	}
}
