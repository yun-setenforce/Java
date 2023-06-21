package ch02.sec02;

/*
 * 날짜 : 2023/06/12
 * 이름 : 정채윤
 * 내용 : 교재 p.41 
 */
public class IntegerLiteralExample {

	public static void main(String[] args) {
		int var1 = 0b1011; 	//2진수
		int var2 = 0206; 	//8진수
		int var3 = 365; 	//10진수
		int var4 = 0xB3; 	//16진수 
		
		char c1 = 65; //10진수 65와 매핑되는 문자 : 'A' 
		char c2 = 0x0041; //16진수 0x0041과 매핑되는 문자 : 'A'
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(c1);
		System.out.println(c2);
		
	}

}
