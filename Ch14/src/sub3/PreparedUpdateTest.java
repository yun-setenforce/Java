package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/*
 * 날짜 : 2023/07/11
 * 이름 : 정채윤
 * 내용 : 
 */
public class PreparedUpdateTest {
	public static void main(String[] args) {
		//DB 정보 
		String host = "jdbc:mysql://localhost:3306/UserDB";
		String user = "root";
		String pass = "1234";
		
		//데이터베이스 접속 
		try {
			//1단계 - JDBC 드라이버 로드 
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2단계 - 데이터베이스 접속 
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			//3단계 - SQL 실행객체 생성 
			String sql = "UPDATE `User2` SET `hp`=?, `age`=? WHERE `uid`=?";
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, "010-1234-5678");
			psmt.setInt(2, 33);
			psmt.setString(3, "j101");
			
			//4단계 - SQL문 전송
			psmt.executeUpdate();
			
			//6단계 - 연결해제 
			psmt.close();
			conn.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Update 완료...");
	}
}
