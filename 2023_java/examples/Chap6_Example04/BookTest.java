package Chap6_Example04;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Book[] books = new Book[3];

        books[0] = new Book("The Catcher in the Rye", "J.D. Salinger");
        books[1] = new Book("To Kill a Mockingbird", "Harper Lee");
        books[2] = new Book("Pride and Prejudice", "Jane Austen");

        System.out.println("Book list:");
        for (Book book : books) {
            System.out.println(book.getTitle() + " by " + book.getAuthor());
        }
	}
}
