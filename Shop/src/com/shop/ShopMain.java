package com.shop;

import java.util.List;
import java.util.Scanner;

import com.shop.dao.CustomerDAO;
import com.shop.dao.OrderDAO;
import com.shop.dao.ProductDAO;
import com.shop.vo.CustomerVO;
import com.shop.vo.OrderVO;
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

		//로그인 사용자 객체 
		CustomerVO loginedCustomer = null;
		
		while(true) {
			if(loginedCustomer == null) {
				System.out.println("[선택지] 종료:0, 로그인:1, 회원가입:2, 상품목록:3, 상품조회:4, 구매하기:5");
			}else{
				System.out.println("[선택지] 종료:0, 로그아웃:1, 주문조회:2, 상품목록:3, 상품조회:4, 구매하기:5");
			}
			System.out.print("[선택] : ");
			int answer = sc.nextInt();
			
			if(answer==0) {
				//종료 
				break;
			}else if(answer==1) {
				//로그인 , 로그아웃
				if(loginedCustomer == null) {
					System.out.print("아이디 입력 : ");
					String custId = sc.next(); 
					loginedCustomer = customerDAO.selectCustomer(custId);
					if(loginedCustomer !=null) {
						System.out.print("[로그인 성공]");
						System.out.println(" " + loginedCustomer.getName() +"님 어서오세요.");
					}else {
						System.out.println("[로그인 실패] 일치하는 회원이 없습니다.");
					}
				} else {
					loginedCustomer = null;
					System.out.println("[로그아웃 성공]");
				}
			}else if(answer==2) {
				if(loginedCustomer ==null) {
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
						loginedCustomer = vo;
					}else {
						System.out.println("[회원가입 실패] 다시 시도해주세요.");
					}
				} else {
					//주문목록조회 
					String orderId = loginedCustomer.getCustId();
					List<OrderVO> myOrders = orderDAO.selectOrders(orderId);
					System.out.println("---------주문 조회---------");
					System.out.println("주문번호\t| 성함\t| 주문상품\t| 주문수량\t| 주문날짜");
					for(OrderVO myOrder : myOrders) {
						System.out.println(myOrder);
					}
					System.out.println("-------------------------");
				}
			}else if(answer==3) {
				//상품 목록 조회  
				List<ProductVO> list = productDAO.selectProducts();
				if(list !=null) {
					System.out.println("---------상품 조회---------");
					for(ProductVO vo : list) {
						System.out.println(vo);
					}
					System.out.println("-------------------------");
				}else {
					System.out.println("[상품 조회 실패]");
				}
			}else if(answer==4) {
				//상품 조회  
				System.out.print("상품 번호 입력 : ");
				int prodNo = sc.nextInt();
				ProductVO vo = productDAO.selectProduct(prodNo);
				if(vo !=null) {
					System.out.print("[조회 성공]");
					System.out.println(" " +vo.getProdNo() + " : " + vo.getProdName() +"");
				}else {
					System.out.println("[조회 실패] 일치하는 상품이 없습니다.");
				}
			}else if(answer==5) {
				//상품 구매 
				if(loginedCustomer == null) {
					System.out.println("[err] 로그인 진행 후 상품 구매를 시도해주세요.");
					continue;
				}
				System.out.print("구매할 상품 번호 입력 : ");
				int prodNo = sc.nextInt();
				System.out.print("구매할 상품 갯수 입력 : ");
				int prodCnt = sc.nextInt();
				
				int result = orderDAO.insertOrder(loginedCustomer.getCustId(), prodNo, prodCnt);
				productDAO.updateProductStock(prodNo, prodCnt);
				
				if(result != 0 ) {
					System.out.print("[주문 성공]");
					System.out.println(" 주문 감사합니다." + loginedCustomer.getName() + "님");
				}else {
					System.out.println("[주문 실패] 다시 시도해주세요.");
				}
			}
			
		}
		
		
		System.out.println("안녕히 가세요~");
		sc.close();
	}
	
}
