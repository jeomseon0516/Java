package sub1;

public class Car {
	
	// 속성(멤버변수)
	String brand;
	String color;
	int speed;
	
	// 기능(멤버메서드)
	public void speedUp(int speed) {
		// this : 클래스의 멤버변수를 참조하는 키워드
		this.speed += speed;
	}
	
	public void speedDown(int speed) {
		this.speed -= speed;
	}
	
	public void show() {
		System.out.println("차량명 : " + this.brand);
		System.out.println("색상 : " + this.color);
		System.out.println("속도 : ");
	}
}
