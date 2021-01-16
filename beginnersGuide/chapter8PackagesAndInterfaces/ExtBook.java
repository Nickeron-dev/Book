package bookpack;

public class ExtBook extends mypack.BookProtected {
	private String publisher;
	
	ExtBook(String title, String author, int pubDate, String publisher) {
		super(title, author, pubDate);
		this.publisher = publisher;
	}
	
	public void show() {
		super.show();
		System.out.println("Publisher: " + publisher);
	}
	
	public String getPublisher() {
		return publisher;
	}
	
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	// Possible because BookProtected is protected
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getTitle() {
		return title;
	}

	public void seTitle(String title) {
		this.title = title;
	}
	
	public int getPubDate() {
		return pubDate;
	}
	
	public void setPubDate(int pubDate) {
		this.pubDate = pubDate;
	}
}