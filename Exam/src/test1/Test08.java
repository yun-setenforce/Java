package test1;

/*
 * 날짜 : 2023/06/13
 * 이름 : 정채윤
 * 내용 : 자바 반복문 연습문제 
 */
public class Test08 {

	public static void main(String[] args) {
		int n = 5;
		for(int i = 0; i<n; i++) {
			for(int j=n-1; j>i; j--) {
				System.out.print(" ");
			}
			for(int j=0; j<=i*2; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}

	}

}
