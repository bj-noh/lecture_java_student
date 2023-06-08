package final_exam_08_10;

// 8 클래스 생성 및 생성자
// 9 멤버 메소드 호출
// 10 클래스 복사

public class BookTest {
	
	public static void main(String[] args) {
		// Num 8 O
		Book emptyBook = new Book();
		System.out.println();
				
		// Num 9 O
		Book Hamlet = new Book("Hamlet", "Shakespeare");
		Hamlet.showBookInfo();
		System.out.println();
		
		// Num 10 X
		Book Python = new Book("Python");
		Book Java = new Book("Java");
		Python.bookPrice = 100;
		Java.bookPrice = 500;
		Python = Java;
		System.out.println("Python book price = " + Python.bookPrice);		
	}
}
