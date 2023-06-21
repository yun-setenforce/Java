package ch05.sec04;
/* 날짜 : 2023/06/14
* 이름 : 정채윤
* 내용 : 교재 p.151
*/
public class NullPointerExceptionExample {

	public static void main(String[] args) {
		int[] intArray = null;
		// int Array[0] = 10; //NullPointerException 
		
		String str = null;
		// System.out.println("총 문자 수 : " +str.length()); //NullPointerException
	}

}
