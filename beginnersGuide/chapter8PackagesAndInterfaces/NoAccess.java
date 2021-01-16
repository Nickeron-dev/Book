package bookpack;

public class NoAccess extends Exception {
	public String toString() {
		return"System.out.println(books[0].title)" +
		 "\n" + "is impossible";
	}
}