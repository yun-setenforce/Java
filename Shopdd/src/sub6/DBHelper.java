package sub6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBHelper  {
	//DB정
	protected final String HOST = "jdbc:mysql://127.0.0.1:3306/Shop";
	protected final String USER = "root"; 
	protected final String PASS = "1234";

	//자원
	protected Connection conn;
	protected Statement stmt;
	protected PreparedStatement psmt;
	protected ResultSet rs;

	//Connection
	protected Connection getConnection() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection(HOST, USER, PASS);
	}

		
	protected void close() throws SQLException{
		if(rs!=null){
			rs.close();
		}
		if(stmt!=null){
			stmt.close();
		}
		if(psmt!=null){
			psmt.close();
		}
		if(conn!=null){
			conn.close();
		}
	}
		
}
