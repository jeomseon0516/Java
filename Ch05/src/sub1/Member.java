package sub1;

public class Member {
	
	String name;
	int age;
	boolean isActive;
	
	public void activate() { isActive = true; }
	public void deactivate() { isActive = false; }
	public boolean isAdult() { return age >= 20; }
	
	public void show() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("활성 회원 여부 : " + isActive);
	}
}
