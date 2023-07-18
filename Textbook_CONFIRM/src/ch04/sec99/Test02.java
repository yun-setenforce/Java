package ch04.sec99;

public class Test02 {
	public static void main(String[] args) {
		String grade = "B";
		
		int score1 = 0;
		score1 = grade=="A"?100
				:grade=="B"?100-20
				:60;
		System.out.println(score1);
	}
}
