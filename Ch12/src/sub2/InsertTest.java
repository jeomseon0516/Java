package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * 날짜 : 2026/05/15
 * 이름 : 남현호
 * 내용 : Java CRUD Insert 실습 
 */
public class InsertTest {
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
			String sql = "INSERT INTO User1 VALUES ('J104', '이순신', '010-1211-1004', 33)";
			stmt.executeUpdate(sql);
			
			// 4) SQL 결과처리(SELECT 작업일 경우)
			// 5) 연결해제
			stmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		System.out.println("Insert 완료...");
	}
}
