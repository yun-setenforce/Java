package com.shop;

import java.util.List;
import java.util.Scanner;

import com.shop.dao.CustomerDAO;
import com.shop.dao.OrderDAO;
import com.shop.dao.ProductDAO;
import com.shop.vo.CustomerVO;
import com.shop.vo.ProductVO;

/*
 * 
 */
public class ShopMain {
	
	
	public static void main(String[] args) {
		System.out.println("----------------------");
		System.out.println("쇼핑몰에 오신 것을 환영합니다.");
		System.out.println("----------------------");
		
		Scanner sc = new Scanner(System.in);
		
		CustomerDAO customerDAO = CustomerDAO.getInstance();
		OrderDAO orderDAO = OrderDAO.getInstance();
		ProductDAO productDAO = ProductDAO.getInstance();

		boolean isLogin = false;
		String loginId = "";
		
		while(true) {
			System.out.println("[선택지] 종료:0, 로그인:1, 회원가입:2, 상품목록:3, 구매하기:4");
			System.out.print("[선택] : ");
			
			int answer = sc.nextInt();
			
			if(answer==0) {
				//종료 
				break;
			}else if(answer==1) {
				//로그인 
				System.out.print("아이디 입력 : ");
				String custId = sc.next();
				CustomerVO vo = customerDAO.selectCustomer(custId);
				if(vo !=null) {
					System.out.print("[로그인 성공]");
					System.out.println(" " + vo.getName() +"님 어서오세요.");
					isLogin = true;
					loginId = vo.getCustId();
				}else {
					System.out.println("[로그인 실패] 일치하는 회원이 없습니다.");
					isLogin = false;
				}
			}else if(answer==2) {
				//회원가입
				CustomerVO vo = new CustomerVO();
				System.out.print("아이디 입력 : ");
				vo.setCustId(sc.next());
				
				System.out.print("이름 입력 : ");
				vo.setName(sc.next());
				
				System.out.print("전화번호 입력 : ");
				vo.setHp(sc.next());
				System.out.print("주소 입력 : ");
				vo.setAddr(sc.next());
				
				int result = customerDAO.insertCustomer(vo);
				if(result != 0) {
					System.out.print("[회원가입 성공]");
					System.out.println(" " + vo.getName() +"님 어서오세요.");
					isLogin = true;
					loginId = vo.getCustId();
				}else {
					System.out.println("[회원가입 실패] 다시 시도해주세요.");
					isLogin = false;
				}
				
			}else if(answer==3) {
				//상품 목록 조회  
				List<ProductVO> list = productDAO.selectProducts();
				if(list !=null) {
					for(ProductVO vo : list) {
						System.out.println(vo);
					}
				}else {
					System.out.println("[상품 조회 실패]");
				}
			}else if(answer==4) {
				//상품 구매 
				if(!isLogin) {
					System.out.println("[err] 로그인 진행 후 상품 구매를 시도해주세요.");
					continue;
				}
				System.out.print("구매할 상품 번호 입력 : ");
				int prodNo = sc.nextInt();
				System.out.print("구매할 상품 갯수 입력 : ");
				int prodCnt = sc.nextInt();
				
				String userName = orderDAO.insertOrder(loginId, prodNo, prodCnt);
				if(userName != "" ) {
					System.out.print("[주문 성공]");
					System.out.println(" 주문 감사합니다." + userName + "님");
				}else {
					System.out.println("[주문 실패] 다시 시도해주세요.");
				}
			}
			
		}
		
		
		System.out.println("안녕히 가세요~");
		sc.close();
	}
	
}
