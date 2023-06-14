package ch04.sec07;
/*
 * 날짜 : 2023/06/14
 * 이름 : 정채윤
 * 내용 : 교재 p.135
 */
public class BreakOutterExample {

	public static void main(String[] args) {
		Outter:for(char upper='A'; upper<='Z'; upper++) {
			for(char lower='a'; lower<='z'; lower++) {
				System.out.println(upper + "-" + lower);
				if(lower == 'g') {
					break Outter; //라벨 붙인 바깥 반복문 종료
				}
			}
		}
		System.out.println("프로그램 종료");

	}

}
