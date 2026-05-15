package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * 날짜 : 2026/05/15
 * 이름 : 남현호
 * 내용 : Java CRUD Update 실습 
 */
public class UpdateTest {
	public static void main(String[] args) {
		// DB 정보
		String host = "jdbc:mysql://127.0.0.1:3306/studydb";
		String user = "astarteam0516";
		String pass = "1234";
		
		try {
			// 1) DB 접속
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			// 2) SQL 실행 겍체 생성
			Statement stmt = conn.createStatement();
			
			// 3) SQL 실행
			String sql = "UPDATE User1 SET name='홍길동', hp='010-1212-0000', age=19 WHERE userid='J102'";
			stmt.executeUpdate(sql);
			
			// 4) SQL 결과처리(SELECT 작업일 경우)
			// 5) 연결해제
			stmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		System.out.println("Update 완료...");
	}
}
