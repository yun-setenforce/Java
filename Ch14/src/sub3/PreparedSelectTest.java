package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/*
 * 날짜 :2023/07/11
 * 이름 :정채윤
 * 내용 :PreparedStatement 실습하기 
 * 
 * PreparedStatement 
 *  - 기존 statement보다 향상된 동적 SQL 생성을 위한 Statement 
 *  - Query Parameter에 값을 Mapping tㅣ켜 쿼리 실행
 * 
 * VO(ValueObject)객체 
 *  - 도메인 값을 속성으로 갖는 객체-
 *  - 테이블 개체(Entity) 객체(Object)로 변환할 떄 사용하는 객체
 *  - DTO와 구분!!
 */

public class PreparedSelectTest {
	public static void main(String[] args) {
		//DB 정보 ///추후 숨겨둘 정보 
		String host = "jdbc:mysql://localhost:3306/UserDB";
		String user = "root";
		String pass = "1234";

		ArrayList<User2VO> users = new ArrayList<>();
		
		//데이터베이스 접속 
		try {
			//1단계 - JDBC 드라이버 로드 
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2단계 - 데이터베이스 접속 
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			//3단계  - SQL실행객체 생성 
			String sql = "SELECT * FROM `User2`";
			PreparedStatement psmt = conn.prepareStatement(sql);
			
			//4단계 -SQL문 전송
			ResultSet rs = psmt.executeQuery();
			
			//5단계 - 결과 처리
			while(rs.next()) {
				//VO객체 생성 및 초기화 
				User2VO vo = new User2VO();
				vo.setUid(rs.getString(1));
				vo.setName(rs.getString(2));
				vo.setHp(rs.getString(3));
				vo.setAge(rs.getInt(4));
				//VO객체 LIst 저장
				users.add(vo);
			}
			//6단계 - 연결 해제
			psmt.close();
			conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		//List 객체 출력 
		for(User2VO vo : users) {
			System.out.println("-----------------");
			System.out.println("아이디 : " + vo.getUid());
			System.out.println("이름 : " + vo.getName());
			System.out.println("휴대폰 : " + vo.getHp());
			System.out.println("나이 : " + vo.getAge());
			System.out.println("-----------------");
		}
	}
}
