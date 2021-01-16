package interfaces;

public class ByThree implements Series {
	int start, variable = 0;
	int previous = -3;
	
	public int getNext() {
		previous = variable;
		variable += 3;
		return variable;
	}
	
	public int getPrevious() {
		return previous;
	}
	
	public void reset() {
		start = variable = 0;
		previous = -3;
	}
	
	public void setStart(int start) {
		this.start = variable = start;
		previous = start - 3;
	}
}
