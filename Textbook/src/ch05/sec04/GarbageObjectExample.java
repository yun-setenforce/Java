package ch05.sec04;
/* 날짜 : 2023/06/14
* 이름 : 정채윤
* 내용 : 교재 p.151
*/
public class GarbageObjectExample {

	public static void main(String[] args) {
		String hobby = "여행";
		hobby = null; //"여행"에 해당하는 String객체를 쓰레기로 만듦 
		
		String kind1 = "자동차";
		String kind2 = kind1; //kind1 변수에 저장되어 있는 번지를 kind2변수에 대
		kind1 = null; //"자동차"에 해당하는 String객체는 쓰레기가 아님
		System.out.println("kind2 : " + kind2);
	}

}
