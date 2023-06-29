package sub1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 날짜 : 2023/06/29 
 * 이름 : 정채윤 
 * 내용 : Java 문자 스트림 실습하기 
 * 
 * 문자스트림 
 *  - 아시아권 문자를 위한 문자 전용 스트림
 *  - 유니코드 기반으로 UTF-8 인코딩으로 아시아권 문자 인코딩 처리 
 */
public class ReaderTest {

	public static void main(String[] args) {
		String path = "/Users/yun/workspace_lotte/Sample1.txt";
		String target = "/Users/yun/workspace_lotte/Sample2.txt";
		
		try {
			//스트림 생성(연결) 
			FileReader fr = new FileReader(path); 
			FileWriter fw = new FileWriter(target);
			while(true) {
				//파일 읽기
				int data = fr.read();
				if(data == -1) {
					//파일을 모두 읽었을 때 반복 종료 
					break;
				}
				// 숫자를 문자로 변환 (캐스팅) 
				char ch = (char)data;
				System.out.print(ch); 
				
				//파일 쓰기 
				fw.write(data);
			}
			//스트림 해제 
			fr.close();
			fw.close();
		} catch (FileNotFoundException e) { 
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println();
		System.out.println("프로그램 종료...");
	}

}
