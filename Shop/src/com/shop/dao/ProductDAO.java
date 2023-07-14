package com.shop.dao;

import java.util.ArrayList;
import java.util.List;

import com.shop.db.DBHelper;
import com.shop.db.SQL;
import com.shop.vo.CustomerVO;
import com.shop.vo.ProductVO;

public class ProductDAO extends DBHelper{	//싱글톤 
	private static ProductDAO instance = new ProductDAO();
	public static ProductDAO getInstance() {
		return instance;
	}
	private ProductDAO() {}
	
	//기본 CRUD메서드
	public int insertProduct(ProductVO vo) {
		return 0;
	}
	public ProductVO selectProduct(int ProductNo) {
		ProductVO vo = null;
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.SELECT_PRODUCT);
			psmt.setInt(1, ProductNo);
			rs = psmt.executeQuery();
			if(rs.next()) {
				vo =  new ProductVO();
				vo.setProdNo(rs.getInt(1));
				vo.setProdName(rs.getString(2));
				vo.setStock(rs.getInt(3));
				vo.setPrice(rs.getInt(4));
				vo.setCompany(rs.getString(5));
			}
			close();
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return vo;
	}
	public List<ProductVO> selectProducts() {
		List<ProductVO> list = new ArrayList<>();
		ProductVO vo = new ProductVO();
		try {
			conn = getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(SQL.SELECT_PRODUCTS);
			while(rs.next()) {
				vo =  new ProductVO();
				vo.setProdNo(rs.getInt("prodNo"));
				vo.setProdName(rs.getString("prodName"));
				vo.setStock(rs.getInt("stock"));
				vo.setPrice(rs.getInt("price"));
				vo.setCompany(rs.getString("company"));
				list.add(vo);
			}
			close();
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	public int updateProduct(ProductVO vo) {
		return 0;
	}
	public void updateProductStock(int pordNo, int orderCnt) {
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.UPDATE_PRODUCT_STOCK);
			psmt.setInt(1, orderCnt);
			psmt.setInt(2, pordNo);
			psmt.executeUpdate();
			close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public int deleteProduct(int ProductNo) {
		return 0;
	}


}
