package enums;

public enum Instruments {
	TRUMPET(8), SAXOFONE(3), TROMBONE(2), PIANO(8), DRUMS(1);
	private int octaves;
	
	Instruments(int octaves) {
		this.octaves = octaves;
	}
	
	public int getOctaves() {
		return octaves;
	}
}
