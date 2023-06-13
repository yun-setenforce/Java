package sub2;

/*
 * 날짜 : 2023/06/12
 * 이름 : 정채윤
 * 설명 : Java 자료형 실습하기
 * 
 * int, double, boolean, string
 * 
 * 
 */
public class DataType {

	public static void main(String[] args) {
		
		// 정수형
		byte num1 = 127; //1byte=8bit
		short num2 = -32767; //2byte
		int num3 = 2147483647; //4byte. 주로 사용
		long num4 = -922337203685477507L; //data 마지막에 대문자 L 표기 (long형)

		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		System.out.println("num3 : " + num3);
		System.out.println("num4 : " + num4);
		
		// 실수형
		float var1 = 0.123456789f; // data 마지막에 소문자 f 표기 (float형). 소수점 8자리까 출력.
		double var2 = 0.1234567890123456789; //소수점 17자리까지 출력. 주로 사용

		System.out.println("var1 : " + var1);
		System.out.println("var2 : " + var2);
	
		// 논리형 
		boolean data1 = true;
		boolean data2 = false;
		
		System.out.println("data1 : " + data1);
		System.out.println("data2 : " + data2);
		
		// 문자형
		char c1 = 'A';
		char c2 = '가';

		System.out.println("c1 : " + c1);
		System.out.println("c2 : " + c2);
		
		// 문자열 
		String str1 = "A";
		String str2 = "가";
		String str3 = "Apple";
		String str4 = "가을";

		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		System.out.println("str3 : " + str3);
		System.out.println("str4 : " + str4);

	}

}
