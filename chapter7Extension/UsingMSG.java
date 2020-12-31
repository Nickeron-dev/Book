package classes;

class ErrorMSG {
	// codes of errors
	final int OUTPUTERR = 0;
	final int INPUTERR = 1;
	final int DISKERROR = 2;
	final int INDEXERR = 3;
	
	String[] messages = {"output error", "input error", "disk error", "index error"};
	
	String yourErr(int indexOfError) {
		if(indexOfError >= 0 & indexOfError < messages.length) {
			return messages[indexOfError];
		} else {
			return "Doesn't exist";
		}
	}		
}

public class UsingMSG {
	public static void main(String[] args) {
		ErrorMSG errors = new ErrorMSG();
		
		System.out.println(errors.yourErr(errors.OUTPUTERR));
		System.out.println(errors.yourErr(errors.DISKERROR));
	}
}
