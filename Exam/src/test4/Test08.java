package test4;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/*
 * 날짜 :2023/06/29 
 * 이름 : 정채윤 
 * 내용 : 로또번호 연습문제 
 */
public class Test08 {
	public static void main(String[] args) {
		for(int count=1; count <=5; count++) {
			System.out.println(makeLotto());
		}
	}
	
	public static Set<Integer> makeLotto(){
		
		Set<Integer> lottoSet = new HashSet<>();
		
		for(;;) {
			//int num = (int) (Math.random()*45) +1;
			int num = (int)Math.ceil(Math.random()*45);
			
			//중복허용을 안 하기 때문에 array말고 집합자료구조 사용 
			lottoSet.add(num);
			
			if(lottoSet.size() == 6)
				break;
		}
		
		//정렬 
		Set<Integer> treeSet = new TreeSet<>(lottoSet);
		
		return treeSet;
	}
}
