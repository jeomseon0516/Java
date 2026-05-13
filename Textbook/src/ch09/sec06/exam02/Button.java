package ch09.sec06.exam02;

public class Button {
	//정적 중첩 인터페이스
	public static interface ClickListener {
		//추상 메서드
		void onClick();
	}
	
	//필드
	private ClickListener clickListener;
	
	//메서드
	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}
}
