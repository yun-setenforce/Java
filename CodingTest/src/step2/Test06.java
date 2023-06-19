package step2;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		//요리시간 60분미만
		if(z<60) {
			if(y+z<60) {
				y = y+z;
			}else {
				y= y+z-60;
				if((x+1)>=24) {
					x=0;
				}else {
					x++;
				}
			}
			
		}else {
		//요리시간 60분 이상 
			int h = z/60;
			int m = z%60;
			if(y+m<60) {
				y=y+m;
				if(x+h>=24) {
					x=x+h-24;
				}else {
					x=x+h;
				}
			}else {
				y=y+m-60;
				if((x+h+1)>=24) {
					x=x+h+1-24;
				}else {
					x = x+h+1;
				}
			}
			
		}
		System.out.println(x + " " + y);
	}

}
