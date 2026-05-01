package sub3;

public class Calc {
	// 싱글톤 객체
	private static Calc instance = new Calc();
	private Calc() {} // 외부에서 객체생성을 막기 위한 private 생성자
	
	public static Calc getInstance() { return instance; }
	
	// 기능
	public int plus(int x, int y) {
		return x + y;
	}
	
	public int minus(int x, int y) {
		return x - y;
	}
	
	public int multi(int x, int y) {
		return x * y;
	}
	
	public int div(int x, int y) {
		return x / y;
	}
}
