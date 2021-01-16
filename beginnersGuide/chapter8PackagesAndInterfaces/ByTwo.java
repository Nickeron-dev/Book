package interfaces;

public class ByTwo implements Series{
	int start = 0;
	int variable = 0;
	
	public int getNext() {
		variable += 2;
		return variable;
	}
	
	public void reset() {
		start = 0;
		variable = 0;
	}
	
	public void setStart(int x) {
		start = variable = x;
	}
}