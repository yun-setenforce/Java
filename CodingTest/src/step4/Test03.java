package step4;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		int max= arr[0], min = arr[0];
		
		for(int j=1;j<arr.length;j++) {
			if(arr[j] > max) {
				max = arr[j];
			}else if(arr[j] < min) {
				min = arr[j];
			}
		}
		System.out.println( min + " " + max);
	}

}
