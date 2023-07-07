package evaluate;

import java.util.Scanner;

public class Stair {
	public static void main(String[] args) {
		
		System.out.println("예제입력");
		Scanner sc = new Scanner(System.in);
		int inputNum = sc.nextInt();
		
		System.out.println("\n예제출력");
		for(int i=1; i<=inputNum; i++) {
			for(int j=inputNum; j>i; j--) {
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
