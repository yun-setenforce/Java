package ch05.sec05;
/* 
* 날짜 : 2023/06/14
* 이름 : 정채윤
* 내용 : 교재 p.158
*/
public class EqualsExample {

	public static void main(String[] args) {
		String ssn = "9506241230123";
		char sex = ssn.charAt(6);
		switch(sex) {
		case '1':
		case '3':
			System.out.println("남자입니다.");
			break;
		case '2':
		case '4':
			System.out.println("여자입니다.");
			break;
		}
		
	}

}
