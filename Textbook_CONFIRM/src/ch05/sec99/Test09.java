package ch05.sec99;

import java.util.Scanner;

public class Test09 {
	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		int answer = 0;
		int studentCnt = 0;
		int[] scores = null;
		int sum = 0, max = 0;
		double avg = 0;
	
		boolean isRunning = true;
		while(isRunning) {
			System.out.println("-----------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-----------------------");
			
			System.out.print("선택> ");
			answer = Integer.parseInt(sc.nextLine());
			switch(answer) {
			case 1 :
				System.out.print("학생수> ");
				studentCnt = Integer.parseInt(sc.nextLine());
				scores = new int[studentCnt];
				break;
			case 2 :
				for(int i=0;i<studentCnt;i++) {
					System.out.print("scores[" + i +"]> ");
					scores[i] = Integer.parseInt(sc.nextLine());
				}
				break;
			case 3 : 
				for(int i=0;i<studentCnt;i++) {
					System.out.println("scores[" + i +"]: " + scores[i] );
				}
				break;
			case 4 : 
				for(int i=0;i<studentCnt;i++) {
					sum += scores[i];
					if(max<scores[i]) {
						max = scores[i];
					}
					
				}
				avg = (double) sum / studentCnt;
				System.out.println("최고  점수 : " + max);
				System.out.println("평균  점수 : " + avg);
				break;
			case 5 : 
			default:
				isRunning = false;
				break;
			}
			
		}
		System.out.println("프로그램 종료");
		
	}
}
