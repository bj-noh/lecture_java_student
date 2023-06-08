package final_exam_08_10;

public class Book {
	private String title;
	private String authorName;
	public int bookPrice;
	
	public Book() {
		this("Empty", "Empty");
		System.out.println("Book() constructor");
	}
	
	public Book(String title) {
		this.title = title;
		this.authorName = "Empty";
	}
	
	public Book(String title, String authorName) {
		this.title = title;
		this.authorName = authorName;
		System.out.println("Book(params) constructor");
	}
	
	public void showBookInfo() {
		System.out.println("Title: " + this.title);
		System.out.println("Author name: " + this.authorName);
	}
}
