package ch02.sec11;
/*
 * 날짜 : 2023/06/13
 * 이름 : 정채윤
 * 내용 : 교재 p.67
 */
public class VariableScopeExample {

	public static void main(String[] args) {
		int v1=15;
		if(v1>10) {
			int v2=v1-10;
		}
//		int v3 = v1 + v2 + 5; //v2변수를 사용할 수 없기 때문에 컴파일 에러 발
		
		
	}

}
