package sub6;

import java.util.Scanner;

/*
 * 
 */
public class ShopMain {
	
	public static boolean isLogin = false;
	
	public static void main(String[] args) {
		System.out.println("----------------------");
		System.out.println("쇼핑몰에 오신 것을 환영합니다.");
		System.out.println("----------------------");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("종료:0, 로그인:1, 회원가입:2, 상품목록:3, 구매하기:4");
			System.out.println("선택 : ");
			
			int answer = sc.nextInt();
			
			if(answer==0) {
				//종료 
				break;
			}else if(answer==1) {
				//로그인 
				System.out.print("아이디 입력 : ");
				String custId = sc.next();
				
				System.out.println(CustomerDAO.getInstance().selectCustomer(custId));
			}
			
		}
		
		
		System.out.println("안녕히 가세요~");
		sc.close();
	}
	
}
