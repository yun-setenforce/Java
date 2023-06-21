package ch03.sec10;

/*
 * 날짜 : 2023/06/13
 * 이름 : 정채윤
 * 내용 : 교재 p.103
 */
public class AssignmentOperatorExample {

	public static void main(String[] args) {
		int result = 0;
		result += 10;
		System.out.println("result = " + result);
		result -= 5;
		System.out.println("result = " + result);
		result *= 3;
		System.out.println("result = " + result);
		result /= 5;
		System.out.println("result = " + result);
		result %=3;
		System.out.println("result = " + result);
	}

}
