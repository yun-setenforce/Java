package ch04.sec02;
/*
 * 날짜 : 2023/06/14
 * 이름 : 정채윤
 * 내용 : 교재 p.117
 */
public class IfNestedExample {
	public static void main(String[] args) {
		int score = (int)(Math.random()*20) + 81;
		System.out.println("점수 : "+score);
		
		String grade;
		
		if(score >= 90) {
			if(score >= 95) {
				grade = "A+";
			}else {
				grade = "A";
			}
		} else {
			if(score>=85) {
				grade = "B+";
			}else {
				grade = "B";
			}
		}
		System.out.println("학점 : "+ grade);
	}
}
