package sub2;

/**
 * 날짜 : 2026/04/28
 * 이름 : 남현호
 * 내용 : Java 메서드 실습
 */
public class MethodTest {
	
	// main 메서드 : Java 프로그램 시작함수
	public static void main(String[] args) {
		
		// 메서드 호출(Call)
		int y1 = f(1); // f 메서드 호출하면서 매개변수 x 인자값 1 전달
		int y2 = f(2);	
		int y3 = f(3);	
		
		System.out.println("y1 : " + y1);
		System.out.println("y2 : " + y2);
		System.out.println("y3 : " + y3);
		
		hello("김유신");
		hello("이순신");
	} // main end
	
	// 메서드 정의(Define)
	public static int f(int x) { /* 반환타입, 메서드명, 매개변수 */ return 2 * x + 3; }
	
	public static void hello(String name) {
		System.out.println("Hello, " + name + "!");
	}
}
