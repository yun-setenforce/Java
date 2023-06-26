package ch03.sec05;

public class InfinityAndNanCheckExample {

	public static void main(String[] args) {
		int x  = 5;
		double y = 0.0;
		double a = x/y;
		double b = x%y;
		
		//잘못된 코드
		System.out.println(a+2);
		System.out.println(b+2);
		
		//알맞은코드 
		if (Double.isInfinite(a)||Double.isNaN(a)) {
			System.out.println("값 산출 불가");
		}else {
			System.out.println(a+2);
		}
		if (Double.isInfinite(b)||Double.isNaN(b)) {
			System.out.println("값 산출 불가");
		}else {
			System.out.println(b+2);
		}
	
	}

}
