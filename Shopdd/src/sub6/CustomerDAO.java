package sub6;

import java.util.List;

public class CustomerDAO extends DBHelper {
	//싱글톤 
	private static CustomerDAO instance = new CustomerDAO();
	public static CustomerDAO getInstance() {
		return instance;
	}
	// 기본 CRUD 메서드 
	public int insertCustomer(CustomerVO vo) {
		int result = 0;
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.INSERT_CUSTOMER);
			psmt.setString(1, vo.getCustId());
			psmt.setString(2, vo.getName());
			psmt.setString(3, vo.getHp());
			psmt.setString(4, vo.getAddr());
			
			result = psmt.executeUpdate();
			
			close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
	public CustomerVO selectCustomer(String custId) {
		CustomerVO vo = null;
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.SELECT_CUSTOMER);
			psmt.setString(1, custId);
			
			rs = psmt.executeQuery();
			if(rs.next()) {
				vo.setCustId(rs.getString(1));
				vo.setName(rs.getString(2));
				vo.setHp(rs.getString(3));
				vo.setAddr(rs.getString(4));
				vo.setRdate(rs.getString(5));
			}
			close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return vo;
	}
	public List<CustomerVO> selectCustomers() {
		return null;
	}
	public int updateCustomer(CustomerVO vo) {
		return 0;
	}
	public int deleteCustomer(String cusstId) {

		return 0;
	}
	
}
