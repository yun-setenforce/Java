package ch05.sec05;
/* 
* 날짜 : 2023/06/14
* 이름 : 정채윤
* 내용 : 교재 p.159
*/
public class LengthExample {

	public static void main(String[] args) {
		String ssn = "9506241230123";
		int length = ssn.length();
		if(length ==13) {
			System.out.println("주민등록번호 자릿수가 맞습니다.");
		}else {
			System.out.println("주민등록번호 자릿수가 틀립니다.");
		}
		
	}

}
