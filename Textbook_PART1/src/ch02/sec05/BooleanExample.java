package ch02.sec05;

/*
 * 날짜 : 2023/06/12
 * 이름 : 정채윤
 * 내용 : 교재 p.48 
 */
public class BooleanExample {
	public static void main(String[] args) {
		boolean stop = true;
		if(stop) {
			System.out.println("중지합니다.");
		}else {
			System.out.println("시작합니다.");
		}
		int x = 10;
		boolean result1 = (x == 20); //변수 x의 값이 20인가?
		boolean result2 = (x != 20); //변수 x의 값이 20이 아닌가??
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
	}
}
