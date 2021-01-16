package bookpack;
import java.io.*;

public class Usebook {
	public static void main(String[] args) {
		mypack.BookPublic[] books = new mypack.BookPublic[4];
		
		books[0] = new mypack.BookPublic("Lost World", "Arthur Conan Doyl", 1990);
		books[1] = new mypack.BookPublic("Rich dad, poor dad", "Robert Kiasaki", 1394);
		books[2] = new mypack.BookPublic("Protection of computer data", "Someone", 2001);
		books[3] = new mypack.BookPublic("Java for beginers", "Herbert Shieldt", 2018);
		
		for(int i = 0; i < books.length; i++) {
			books[i].show();
		}
	}
}