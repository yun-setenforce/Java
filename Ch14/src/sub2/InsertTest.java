package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * 날짜 : 2023/07/10
 * 이름 : 정채윤
 * 내용 : Insert 실습하기 
 */
public class InsertTest {

	public static void main(String[] args) {
		
		// DB 정보
		String host = "jdbc:mysql://127.0.0.1:3306/UserDB";
		String user = "root";
		String pass = "1234";
		
		// 데이터베이스 접속 
		try {
			// 1단계  - JDBC 드라이버 로드 
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2단계  - 데이터베이스 접속  
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			// 3단계  - SQL 실행 객체(Statement/PreparedStatement) 생성  
			Statement stmt = conn.createStatement();
			
			// 4단계  - SQL문 전송  
			String sql = "INSERT INTO `User1` VALUES ('J101', '김유신', '010-1234-1001', 23)";
			stmt.executeUpdate(sql);
			
			// 5단계  - 결과 처리 (SELECT문일 경우) ///Insert 등은 생략 
			// 6단계  - 연결 해제
			stmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Insert 완료...");
	}

}
