package ch02.sec01;

/*
 * 날짜 : 2023/06/12
 * 이름 : 정채윤
 * 내용 : 교재 p. 38
 */
public class VariableExchangeExample {

	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		System.out.println("x:" + x + ", y:" + y);
		
		int temp = x;
		x = y;
		y = temp;
		System.out.println("x:" + x + ", y:" + y);

	}

}
