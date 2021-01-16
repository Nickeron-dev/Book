package bookpack;
import java.io.*;
import mypack.BookPublic;
// to import everything use *

public class UseBookImport {
	public static void main(String[] args) {
		PrintWriter pw = new PrintWriter(System.out, true);
		BookPublic[] books = new BookPublic[4];
		
		books[0] = new BookPublic("Lost World", "Arthur Conan Doyl", 1990);
		books[1] = new BookPublic("Rich dad, poor dad", "Robert Kiasaki", 1394);
		books[2] = new BookPublic("Protection of computer data", "Someone", 2001);
		books[3] = new BookPublic("Java for beginers", "Herbert Shieldt", 2018);
		
		for(int i = 0; i < books.length; i++) {
			books[i].show();
		}
	}
}