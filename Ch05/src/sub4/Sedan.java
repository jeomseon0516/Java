package sub4;

public class Sedan extends Car {
	
	private int cc;
	
	public Sedan(String name, String color, int speed, int cc) {
		super(name, color, speed); 
		this.cc = cc;
	}
	
	public void drive() {
		System.out.println("Sedan drive!!!");
		System.out.println("차량 배기량 : " + this.cc);
		super.show(); // 부모(super)의 show() 호출
	}
}
