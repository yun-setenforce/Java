package ch03.sec03;
/*
 * 날짜 : 2023/06/13
 * 이름 : 정채윤
 * 내용 : 교재 p.84
 */

public class OverflowUnderflowExample {

	public static void main(String[] args) {
		byte var1 = 125;
		for(int i = 0; i < 5; i++) {
			var1++;
			System.out.println("var1 : "+ var1);
		}
		
		System.out.println("----------------------");
		
		byte var2 = -125;
		for(int i=0;i<5;i++) {
			var2--;
			System.out.println("var2 : "+ var2);
		}

	}

}
