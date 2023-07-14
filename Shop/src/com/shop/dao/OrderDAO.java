package com.shop.dao;


import java.sql.ResultSet;
import java.util.ArrayList;
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
	public int insertOrder(String loginId, int prodNo, int prodCnt) {
		int result = 0;
		int orderNoCnt =0;
		try {
			conn = getConnection();
			
			/** orderNo 구하기 **/
			stmt = conn.createStatement();
			rs  = stmt.executeQuery("SELECT MAX(`orderNo`) FROM `Order`");
			if(rs.next()) {
				orderNoCnt = rs.getInt(1) +1;
			}

			/** order insert **/
			psmt = conn.prepareStatement(SQL.INSERT_ORDER);
			psmt.setInt(1, orderNoCnt);
			psmt.setString(2, loginId);
			psmt.setInt(3, prodNo);
			psmt.setInt(4, prodCnt);
			
			result = psmt.executeUpdate();
			close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
	public OrderVO selectOrder(int orderNo) {
		return null;
	}
	public List<OrderVO> selectOrders(String orderId) {
		List<OrderVO> orders = new ArrayList<>();
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.SELECT_ORDERS);
			psmt.setString(1, orderId);
			rs = psmt.executeQuery();
			while(rs.next()) {
				OrderVO  vo = new OrderVO();
				vo.setOrderNo(rs.getInt("orderNo"));
				vo.setOrderId(rs.getString("orderId"));
				vo.setOrderProduct(rs.getInt("orderProduct"));
				vo.setOrderCount(rs.getInt("orderCount"));
				vo.setOrderDate(rs.getString("orderDate").substring(0,16));
				vo.setName(rs.getString("name"));
				vo.setProdName(rs.getString("prodName"));
				
				orders.add(vo);
			}
			
			close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return orders;
	}
	public int updateOrder(OrderVO vo) {
		return 0;
	}
	public int deleteOrder(int orderNo) {
		return 0;
	}
}
