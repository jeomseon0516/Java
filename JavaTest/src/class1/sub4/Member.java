package class1.sub4;

public class Member {
	private String name; // 회원 이름
	private String memberId; // 회원 아이디
	private Book borrowedBook; // 회원이 대출한 도서
	
	public Member(String name, String memberId) {
		this.name = name;
		this.memberId = memberId;
	}
	
	public void borrowBook(Book book) {
		if (borrowedBook != null) {
			System.out.printf("%s 이미 대출됨\n", borrowedBook.getTitle());
			return;
		}
		
		borrowedBook = book;
		borrowedBook.borrowBook();
		System.out.printf("도서대출 : %s\n", borrowedBook.getTitle());
	}
	
	public void returnBook(Book book) {
		if (borrowedBook == null || borrowedBook != book) return;
		
		borrowedBook.returnBook();
		System.out.printf("도서반납 : %s\n", borrowedBook.getTitle());
		borrowedBook = null;
	}
	
	public void getMemberInfo() {
		System.out.println("이름 : " + name);
		System.out.println("회원 ID : " + memberId);
		System.out.println("대출한 도서 : " + (borrowedBook != null ? borrowedBook.getTitle() : "없음"));
	}
}
