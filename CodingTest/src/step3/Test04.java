package step3;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int n = sc.nextInt();
		int sum = 0;
		for(int i=0; i<n; i++) {
			int a = sc.nextInt(); 
			int b = sc.nextInt();
			sum += a*b;
		}
		
		if(sum==x) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}

}
