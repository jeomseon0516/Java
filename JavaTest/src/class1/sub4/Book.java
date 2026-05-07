package class1.sub4;

public class Book {
	private String title; // 도서제목
	private String author; // 저자
	private String isbn; // 도서번호
	private boolean isBorrowd = false; // 도서 대출 여부
	
	public Book(String title, String author, String isbn) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
	}
	
	public String getTitle() { return title; }
	
	public void borrowBook() {
		if(isBorrowd) return;
		
		isBorrowd = true;
	}
	
	public void returnBook() {
		if(!isBorrowd) return;
		
		isBorrowd = false;
	}
	
	public void getBookInfo() {
		System.out.println("제목 : " + title);
		System.out.println("저자 : " + author);
		System.out.println("ISBN : " + isbn);
		System.out.println("대출 여부 : " + (isBorrowd ? "불가능" : "가능"));
	}
}
