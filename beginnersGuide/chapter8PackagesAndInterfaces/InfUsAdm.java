package interfaces;

public interface InfUsAdm {
	int getUserID();
	default int getAdminID() {
		return 1;
	}
	static int getUniversalID() {
		return 0;
	}
}
