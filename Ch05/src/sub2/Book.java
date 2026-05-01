package sub2;

public class Book {
	
	// 속성
	private String title;
	private String author;
	private int copies;
	
	// 생성자
	public Book(String title, String author, int copies) {
		this.title = title;
		this.author = author;
		this.copies = copies;
	}
	
	// 기능
	public String getTitle() { return title; }
	public void setTitle(String title) { this.title = title; }
	
	public String getAuthor() { return author; }
	public void setAuthor(String author) { this.author = author; }
	
	public int getCopies() { return copies; }
	public void setCopies(int copies) { this.copies = copies; }
	
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
