package ch05.sec05;
/* 
* 날짜 : 2023/06/14
* 이름 : 정채윤
* 내용 : 교재 p.162
*/
public class SubStringExample {

	public static void main(String[] args) {
		String ssn = "880815-1234567";

		String firstNum = ssn.substring(0,6);
		System.out.println(firstNum);

		String secondNum = ssn.substring(7);
		System.out.println(secondNum);
		
	}

}
