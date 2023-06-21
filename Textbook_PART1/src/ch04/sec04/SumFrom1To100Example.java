package ch04.sec04;
/*
 * 날짜 : 2023/06/14
 * 이름 : 정채윤
 * 내용 : 교재 p.127
 */
public class SumFrom1To100Example {

	public static void main(String[] args) {
		//부동 소수점 방식의 float타입은 연산 과정에서 정확히 0.1을 표현하지 못하기 때문에 최종 반복횟수가 9번이 
		for(float x = 0.1f; x<=1.0f; x+=0.1f) {
			System.out.println(x);
		}

	}

}
