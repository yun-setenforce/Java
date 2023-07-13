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
		return null;
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
				vo.setProdNo(rs.getInt(1));
				vo.setProdName(rs.getString(2));
				vo.setStock(rs.getInt(3));
				vo.setPrice(rs.getInt(4));
				vo.setCompany(rs.getString(5));
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
	public int deleteProduct(int ProductNo) {
		return 0;
	}


}
