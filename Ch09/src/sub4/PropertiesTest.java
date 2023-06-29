package sub4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/*
 * 날짜 : 2023/06/29
 * 이름 : 정채윤 
 * 내용 : Java Properties 실습하기 
 * 
 * 프로퍼티(Properties)
 *  - 문자열 데이터만 취급하는 Key-Value 자료구조 클래스
 *  - 프로그램의 환경설정값을 저장할 때 많이 사용 
 *  - 입출력스트림으로 데이터 입출력하는 자료구조 클래스 
 */
public class PropertiesTest {
	public static void main(String[] args) {
		///스트림-자료구조 연겷되는, 자주 사용되는 기법 
		
		// 프로퍼티 생성 
		Properties prop = new Properties();
		prop.setProperty("A", "Apple");
		prop.setProperty("B", "Banana");
		prop.setProperty("C", "Cherry");
		
		// System.out.println(prop);

		String path = "/Users/yun/workspace_lotte/Fruit.properties"; ///확장자 반드시!!properties
		
		// 프로퍼티 파일 저장(내보내기) 
		try {
			FileOutputStream fos = new FileOutputStream(path);
			prop.store(fos, null);
			
			
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		// 프로퍼티 파일 읽기 
		String target = "/Users/yun/workspace_lotte/Cities.properties";
		
		Properties propCities = new Properties();
		
		try {
			FileInputStream fis = new FileInputStream(target);
			propCities.load(fis);
			
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		System.out.println(propCities);
		System.out.println("한국 : " + propCities.getProperty("kor"));
		System.out.println("미국 : " + propCities.getProperty("usa"));
		System.out.println("일본 : " + propCities.getProperty("jp"));
		System.out.println("시스템 종료 ... ");
		
	}
}
