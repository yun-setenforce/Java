package ch03.sec11;

/*
 * 날짜 : 2023/06/13
 * 이름 : 정채윤
 * 내용 : 교재 p.104
 */
public class ConditionalOperationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 85;
		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
		System.out.println(score+"점은 " + grade +"등급입니다.");

	}

}
