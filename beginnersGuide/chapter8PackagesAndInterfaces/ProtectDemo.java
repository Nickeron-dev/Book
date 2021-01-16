package bookpack;

public class ProtectDemo {
	public static void main(String[] args) {
		ExtBook[] books = new ExtBook[4];
		
		books[0] = new ExtBook("Lost World", "Arthur Conan Doyl", 1990, "Williams");
		books[1] = new ExtBook("Rich dad, poor dad", "Robert Kiasaki", 1394, "Ababagalamaga");
		books[2] = new ExtBook("Protection of computer data", "Someone", 2001, "Something");
		books[3] = new ExtBook("Java for beginers", "Herbert Shieldt", 2018, "Dialectica");
		
		// looking for Herbert Shield books
		for(int i = 0; i < books.length; i++) {
			if(books[i].getAuthor().equals("Herbert Shieldt")) {
				books[i].show();
			}
		}
		
		try {
			throw new NoAccess();
		}
		catch(NoAccess exc) {
			System.out.println(exc);
		}	
	}
}