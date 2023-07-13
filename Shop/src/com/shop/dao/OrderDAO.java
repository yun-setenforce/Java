package com.shop.dao;


import java.sql.ResultSet;
import java.util.List;

import com.shop.db.DBHelper;
import com.shop.db.SQL;
import com.shop.vo.OrderVO;


public class OrderDAO extends DBHelper {
	//싱글톤 
	private static OrderDAO instance = new OrderDAO();
	public static OrderDAO getInstance() {
		return instance;
	}
	private OrderDAO() {}
	
	//기본 CRUD메서드
	public String insertOrder(String loginId, int prodNo, int prodCnt) {
		int result = 0;
		int orderNoCnt =0;
		String name = "";
		try {
			conn = getConnection();
			
			/** orderNo 구하기 **/
			stmt = conn.createStatement();
			rs  = stmt.executeQuery("SELECT MAX(`orderNo`) FROM `Order`");
			if(rs.next()) {
				orderNoCnt = rs.getInt(1) +1;
			}
			/** customer이름 구하기 **/
			psmt = conn.prepareStatement(SQL.ORDER_OWNER);
			psmt.setString(1, loginId);
			rs = psmt.executeQuery();
			if(rs.next()) {
				name = rs.getString(1);
			}

			/** order insert **/
			psmt = conn.prepareStatement(SQL.INSERT_ORDER);
			psmt.setInt(1, orderNoCnt);
			psmt.setString(2, loginId);
			psmt.setInt(3, prodNo);
			psmt.setInt(4, prodCnt);
			
			result = psmt.executeUpdate();
			if(result == 0) {
				throw new Exception("상품 주문 실패!!");
			}
			
			close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return name;
	}
	public OrderVO selectOrder(int orderNo) {
		return null;
	}
	public List<OrderDAO> selectOrders() {
		return null;
	}
	public int updateOrder(OrderVO vo) {
		return 0;
	}
	public int deleteOrder(int orderNo) {
		return 0;
	}
}
