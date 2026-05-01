package sub2;

public class Member {
	
	private String name;
	private int age;
	private boolean isActive;
	
	public Member(String name, int age, boolean isActive) {
		this.name = name;
		this.age = age;
		this.isActive = isActive;
	}
	
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	
	public int getAge() { return age; }
	public void setAge(int age) { this.age = age; }
	
	public boolean getIsActive() { return isActive; }
	public void setIsAcitve(boolean isActive) { this.isActive = isActive; }
	
	public void activate() { isActive = true; }
	public void deactivate() { isActive = false; }
	public boolean isAdult() { return age >= 20; }
	
	public void show() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("활성 회원 여부 : " + isActive);
	}
}
