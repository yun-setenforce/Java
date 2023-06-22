package sub7;

/*
 * 날짜 : 2021/06/22
 * 이름 : 정채윤  
 * 내용 : Java 다형성 실습하기 
 * 
 * 다형성 (Polymorphism)
 *  - 상속관계에서 부모클래스의 기능이 자식클래스에서 다양한 기능으로 변하는 특성 
 *  - 객체의 타입선언을 부모클래스 타입으로 선언 
 *  - 다형성을 활용해서 프로그래밍의 중복을 줄이고 유연성을 높임 
 */
public class PolyTest {
	public static void main(String[] args) {
		
		//다형성을 적용한 객체 생성 (업캐스팅)
		Animal a1 = new Tiger();
		Animal a2 = new Eagle();
		Animal a3 = new Shark();
		
		a1.move();
		a1.hunt();
		
		a2.move();
		a2.hunt();
		
		a3.move();
		a3.hunt();

		//다운캐스팅 
		Tiger tiger = (Tiger) a1;
		Eagle eagle = (Eagle) a2;
		Shark shark = (Shark) a3;
		
		tiger.move();
		tiger.hunt();
		
		eagle.move();
		eagle.hunt();
		
		shark.move();
		shark.hunt();
		
		//객체 타입 비교연산 
		if(a1 instanceof Tiger) { //a1이라는 참조변수가 실제 어떤 인스턴스인지 확인 
			System.out.println("a1은 Tiger입니다.");
		}else if(a1 instanceof Eagle) {
			System.out.println("a1은 Eagle입니다.");
		}else if (a1 instanceof Shark) {
			System.out.println("a1은 Shark입니다.");
		}
		
		// 다형성을 활용한 객체 배열 
		/// 배열 : 같은 타입의 개체들을 모아둔 것. 객체 역시 같은 타입이 될 수 있다! >다형성 활용 
		Animal arr[] = {tiger, eagle, shark};
		arr[0].move();
		arr[1].move();
		arr[2].move();
	}
}
