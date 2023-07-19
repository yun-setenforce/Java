package ch06.sec99;

class ShopService {
	private static ShopService ss = new ShopService();
	private ShopService() {}
	public static ShopService getInstance() {
		return ss;
	}
}

public class Test19 {
	public static void main(String[] args) {
		
		
		ShopService obj1 = ShopService.getInstance();
		ShopService obj2 = ShopService.getInstance();
		
		if(obj2 == obj2) {
			System.out.println("같은 ShopService 객체입니다.");
		}else {


			System.out.println("다 ShopService 객체입니다.");
		}
		
		
	}
}
