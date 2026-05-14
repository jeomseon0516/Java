package sub3;

public class Count {

	private int num;
	
	public int getNum() {
		return num;
	}
	
	public synchronized void setNum() {
		// 임계영역 : 멀티 스레드에 의해 공유자원이 참조되는 코드 범위
		
		synchronized(this) { 
			// 동기화 영역
			num++;
		}
	}
}
