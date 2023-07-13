package sub6;


import java.util.List;

public class OrderDAO extends DBHelper {
	//싱글톤 
	private static OrderDAO instance = new OrderDAO();
	public static OrderDAO getInstance() {
		return instance;
	}
	private OrderDAO() {}
	
	//기본 CRUD메서드
	public int insertOrder(OrderVO vo) {
		return 0;
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
