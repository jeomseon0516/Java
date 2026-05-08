package ch07.sec05.exam02;

public class SportsCar extends Car {
	@Override
	public void speedUp() {
		speed += 10;
	}
	
	// final 키워드가 붙은 메서드는 자식에서 오버라이딩을 할 수 없음
	/*private void stop() {
		System.out.println("스포츠카를 멈춤");
		speed = 0;
	}*/
}
