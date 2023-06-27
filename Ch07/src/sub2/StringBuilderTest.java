package sub2;
/*
 * 날짜 : 2023/06/27
 * 이름 : 정채윤 
 * 내용 : Java StringBuilder 클래스 실습하기 
 * 
 * String 클래스 
 *  - String은 문자열을 처리하는 클래스
 *  - 문자열 비교는 equals, 다양한 문자열 가공 메서드 제공
 *  - String 클래스의 immutable 특성으로 인한 성능을 개선하기 위해 StringBuilder 사용 
 */
public class StringBuilderTest {
	public static void main(String[] args) {
		
		//String imutable 
		///주소가 다르다 
		String str = "Java";
		System.out.println("str 객체주소 : " + System.identityHashCode(str)) ;
		
		str += "Programming";
		System.out.println("str 객체주소 : " + System.identityHashCode(str)) ;
		
		System.out.println("str : " + str);
		
		
		//String 의 immutable 특성을 개선한 StringBuilder 
		///하나의 메모리 공간에서! (성능적인 시점에서 good~)
		StringBuilder sb = new StringBuilder("Java");
		System.out.println("sb 객체주소 : " + System.identityHashCode(sb)) ;
		sb.append("Programming");
		System.out.println("sb 객체주소 : " + System.identityHashCode(sb)) ;
	
		
	}
}
