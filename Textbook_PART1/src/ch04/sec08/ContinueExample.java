package ch04.sec08;
/*
 * 날짜 : 2023/06/14
 * 이름 : 정채윤
 * 내용 : 교재 p.137
 */
public class ContinueExample {

	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			if(i%2 != 0) {
				continue; //2로 나눈 나머지가 0이 아닐 경우 다음 반복으로 넘어간다. 
			}
			System.out.print(i+" ");
		}

	}

}
