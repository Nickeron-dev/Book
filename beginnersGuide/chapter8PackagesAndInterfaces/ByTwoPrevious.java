package interfaces;

public class ByTwoPrevious implements Series {
	int start, variable = 0;
	int previous = -2;
	
	public int getNext() {
		previous = variable;
		variable += 2;
		return variable;
	}
	
	public void reset() {
		start = variable = 0;
		previous = -2;
	}
	
	public void setStart(int start) {
		this.start = this.variable = start;
		previous = start - 2;
	}
	
	public int getPrevious() {
		return previous;
	}
}