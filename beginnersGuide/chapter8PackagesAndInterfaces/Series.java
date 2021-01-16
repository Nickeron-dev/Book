package interfaces;

public interface Series {
	int getNext();
	default int[] getNextArray(int n) {
		int[] array = new int[n];
		for(int i = 0; i < n; i++) {
			array[i] = getNext();
		}
		return array;
	}
	void reset();
	void setStart(int x);
}

