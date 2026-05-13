package sub3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * 날짜 : 2026/05/13
 * 이름 : 남현호
 * 내용 : Java 역직렬화 실습 
 */
public class DeserializeTest {
	public static void main(String[] args) {
		
		// 경로 설정
		String path = "C:\\Users\\GGG\\Desktop\\apple.data";
		
		try {
			FileInputStream fis = new FileInputStream(path);
			
			// 직렬화를 위한 보조스트림
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			// 객체 직렬화(가져오기)
			Apple apple = (Apple)ois.readObject();
			apple.show();
			
			// 스트림 해제
			ois.close();
			fis.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료...");
	}
}
