package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedDeleteTest {
	public static void main(String[] args) {
		//DB 정보
		String host = "jdbc:mysql://localhost:3306/UserDB";
		String user = "root";
		String pass = "1234";
		
		//eㅔ이터베이스 접속 
		try {
			//1단계 - JDBC 드라이버 로드 
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2단계  - 데이터베이스 접속 
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			//3단계 - SQL 객체 생성 
			String sql = "DELETE FROM `User2` WHERE `uid`=?";
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1,"j101");
			
			//4단계 - SQL 문 전송
			psmt.executeUpdate();
			
			//6단 - 연결 해제
			psmt.close();
			conn.close();
		}catch(Exception e) {
			
		}
		System.out.println("Delete 완료...");
	}
}
