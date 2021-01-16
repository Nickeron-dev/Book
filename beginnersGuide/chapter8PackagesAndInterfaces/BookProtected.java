package mypack;
import java.io.*;

public class BookProtected {
	protected String title;
	protected String author;
	protected int pubDate;
	protected PrintWriter pw = new PrintWriter(System.out, true);
	
	public BookProtected(String title, String author, int pubDate) {
		this.title = title;
		this.author = author;
		this.pubDate = pubDate;
	}
	
	public void show() {
		pw.println("Title: " + title + " Author: " + author + " pubDate: " + pubDate);
	}
}
		