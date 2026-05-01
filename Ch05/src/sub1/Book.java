package sub1;

public class Book {
	
	String title;
	String author;
	int copies;
	
	public boolean borrowBook() {
		if (copies <= 0) return false;
		
		copies--;
		return true;
	}
	
	public void returnBook() {
		copies++;
	}
	
	public void show() {
		System.out.println("책 제목 : " + title);
		System.out.println("저자 : " + author);
		System.out.println("이용 가능한 복사본 수 : " + copies);
	}
}
