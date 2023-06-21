package ch04.sec04;
/*
 * 날짜 : 2023/06/14
 * 이름 : 정채윤
 * 내용 : 교재 p.126
 */
public class PrintFrom1To10Example {

	public static void main(String[] args) {
		int sum = 0; //합계변수
		int i; //카운터 변수
		for(i=1; i<=10; i++) {
			sum += i;
		}
		System.out.println("1~" + (i-1) + " 합 : " + sum);

	}

}
