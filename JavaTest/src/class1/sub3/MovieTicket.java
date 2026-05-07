package class1.sub3;

public class MovieTicket {
	private String movieTitle; // 영화제목
	private String screenTime; // 상영시간
	private String seatNumber; // 좌석번호
	private boolean isBooked = false; // 예매여부
	
	public MovieTicket(String movieTitle, String screenTime, String seatNumber) {
		this.movieTitle = movieTitle;
		this.screenTime = screenTime;
		this.seatNumber = seatNumber;
	}
	
	public void bookTicket() {
		if (isBooked) {
			System.out.println("이미 예매됨");
			return;
		}
		
		isBooked = true;
		System.out.printf("%s, %s, %s 예매 완료\n", movieTitle, screenTime, seatNumber);
	}
	
	public void cancelBook() {
		if(!isBooked) {
			System.out.println("아직 예매 안됨");
			return;
		}
		
		isBooked = false;
		System.out.printf("%s, %s, %s 취소 완료\n", movieTitle, screenTime, seatNumber);
	}
	
	public void printTicketInfo() {
		System.out.println("영화제목 : " + movieTitle);
		System.out.println("상영시간 : " + screenTime);
		System.out.println("좌석번호 : " + seatNumber);
		System.out.println("예약여부 : " + isBooked);
	}
}
