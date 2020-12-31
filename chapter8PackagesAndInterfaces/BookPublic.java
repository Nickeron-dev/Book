package mypack;
import java.io.*;

public class BookPublic {
	private String title;
	private String author;
	private int pubDate;
	
	// Creating public constructor
	public BookPublic(String title, String author, int pubDate) {
		this.title = title;
		this.author = author;
		this.pubDate = pubDate;
	}
	
	// Creating public method
	public void show() {
		PrintWriter pw = new PrintWriter(System.out, true);
		pw.println("Title: " + title + " Author: " + author + " Date: " + pubDate);
	}
}
