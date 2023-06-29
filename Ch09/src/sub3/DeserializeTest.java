package sub3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/*
 * 날짜 : 2023/06/29 
 * 이름 : 정채윤 
 * 내용 : Java 역직렬화 실습하기 
 * 
 */
public class DeserializeTest {
	public static void main(String[] args) {

		String path = "/Users/yun/workspace_lotte/Apple.dat";
		try {
			//스트림 생성 
			FileInputStream fis = new FileInputStream(path);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			//역직렬화 
			Apple apple = (Apple) ois.readObject(); // 모든 클래스는Object로 Up-Casting이, Object는 모든 클래스로 Down-Casting이 가능하다. 
			apple.show();
			
			//스트림 해제 
			fis.close();
			ois.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료...");
	}
	
	
}
