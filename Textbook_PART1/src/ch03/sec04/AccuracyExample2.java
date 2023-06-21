package ch03.sec04;
/*
 * 날짜 : 2023/06/13
 * 이름 : 정채윤
 * 내용 : 교재 p.86
 */
public class AccuracyExample2 {

	public static void main(String[] args) {
		int apple = 1;
		//double pieceUnit = 0.1;
		int totalPieces = apple*10;
		int number = 7;
		
		// double result = apple - number*pieceUnit;
//		System.out.println("사과 1개에서 남은 양: "+ result); //0.29999999999999993
		int result = totalPieces - number;
		System.out.println("10조각에서 남은 조각 : " + result);
		System.out.println("사과 1개에서 남은 양: " + result/10.0);


	}

}
