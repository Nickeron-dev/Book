package mypack;
import java.io.*;

class Book {
	final private String title;
	final private String author;
	final private int year;
	
	Book(String title, String author, int year) {
		this.title = title;
		this.author = author;
		this.year = year;
	}
	
	String getTitle() {
		return title;
	}
	
	String getAuthor() {
		return author;
	}
	
	int getYear() {
		return year;
	}
	
	String showInf() {
		return title + " " + author + " " + year;
	}
}

public class BookMain {
	public static void main(String[] args) {
		PrintWriter pw = new PrintWriter(System.out, true);
		Book[] books = new Book[4];
		
		books[0] = new Book("Lost World", "Arthur Conan Doyl", 1990);
		books[1] = new Book("Rich dad, poor dad", "Robert Kiasaki", 1394);
		books[2] = new Book("Protection of computer data", "Someone", 2001);
		books[3] = new Book("Java for beginers", "Herbert Shieldt", 2018);
		
		for(int i = 0; i < books.length; i++) {
			pw.println(books[i].showInf());
		}
	}
}
