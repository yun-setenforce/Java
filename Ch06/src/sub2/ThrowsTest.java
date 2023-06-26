package sub2;

import java.util.Scanner;

/*
 * 날짜 : 2023/06/26
 * 이름 : 정채윤 
 * 내용 : Java Throws 실습하기 
 */
public class ThrowsTest {
	public static void main(String[] args) {
		try {
			myMethod1(10);
		} catch (Exception e) { //ArithmeticException InputMismatchException
			e.printStackTrace();
		}
		
		System.out.println("프로그램 정상 종료...");
	}

	
	public static void myMethod1(int n1) throws Exception{
		myMethod2(n1);
	}
	
	public static void myMethod2(int n1) throws Exception {
		
		Scanner scan = new Scanner(System.in); //ArithmeticException만 체크했을 경우 다른 종류의 예외를 못 잡아냄 
		System.out.print("n2입력 : ");
		int n2 = scan.nextInt();
		
		int result = n1 / n2;
		
		
		System.out.println("result : " + result);
	}
	
}
