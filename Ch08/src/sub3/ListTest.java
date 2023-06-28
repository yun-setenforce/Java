package sub3;

import java.util.ArrayList;
import java.util.List;

/*
 * 날짜 : 2023/06/28
 * 이름 : 정채윤
 * 내용 : Java 자료구조 리스트 실습하기 
 * 
 * List
 *  - 배열과 유사하지만 동적으로 생성되는 선형 자료구조 
 *  - List를 구현한 ArrayList 
 */
public class ListTest {
	public static void main(String[] args) {
		
		// List 생성 
		///ArrayList = List인터페이스를 구현한 구현체.라서 List선언해주면 다형성이 적용됨. 
		List<Integer> list = new ArrayList<>();
		
		// 데이터 입력 
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		//데이터 삽입 
		list.add(1, 6); ///index 1에 6을 삽입
		System.out.println(list); ///toString() 호출 
		
		//데이터 제거 
		list.remove(2); ///2번 index의 요소 제거 
		System.out.println(list); ///toString() 호출 
		
		//데이터 출력 
		System.out.println("list 1번째 원소: " + list.get(0));
		System.out.println("list 2번째 원소: " + list.get(1));
		System.out.println("list 3번째 원소: " + list.get(3));

		// 리스트 크기 
		System.out.println("list 크기 : " +list.size());
		
		//리스트 반복문
		for(int num :list) {
			///현재 list에는 각 숫자가 Integer wrapperclass로 Boxing되어 저장되어 있음.
			/// 변수 num에 list의 요소를 Auto unboxing되어 대입 
			System.out.println(num);
		}
		
		System.out.println("--------------");
		
		//문자열 리스트
		List<String> people = new ArrayList<>();
		
		people.add("김유신");
		people.add("김춘추");
		people.add("장보고");
		people.add("강감찬");
		people.add("이순신");
		
		System.out.println(people);

		System.out.println("--------------");
		
		// 객체 리스트
		List<Apple> apples = new ArrayList<>();
		
		Apple a1 = new Apple("한국", 3000);
		Apple a2 = new Apple("미국", 2000);
		
		apples.add(a1);
		apples.add(a2);
		apples.add(new Apple("일본", 1000));
		
		Apple apple = apples.get(0);
		apple.show();
		
		apples.get(1).show(); ///체이닝 :메소드 2번 연달아서 호출 
		apples.get(2).show();
	}
}
