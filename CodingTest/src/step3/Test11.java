package step3;

import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b=0;
		do {
			a = sc.nextInt();
			b = sc.nextInt();
			if(a==0 && b ==0) {
				break;
			}
			System.out.println(a+b);
		}while(true);

	}

}
