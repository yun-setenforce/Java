package step2;

import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[3];
		arr[0] = sc.nextInt();
		arr[1] = sc.nextInt();
		arr[2] = sc.nextInt();
		int result = 0;
		
		//크기 작은 순으로 정렬
		for(int i=0; i<2; i++) {
			for(int j = i+1; j<3; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		
		//세 눈이 모두 다를 
		if(arr[0]!=arr[1] && arr[1]!=arr[2] && arr[0]!=arr[2]) {
			result = arr[2]*100;
		}else if(  arr[0]==arr[1] && arr[0]!=arr[2] ) {
			result = 1000+arr[0]*100;
		}else if(arr[0]!=arr[1] && arr[1]==arr[2]) {
			result = 1000+arr[2]*100;
		}else if(arr[0]==arr[1] && arr[0]==arr[2]) {
			result=10000 + arr[0]*1000;
		}
		System.out.println(result);
	}
}
	
