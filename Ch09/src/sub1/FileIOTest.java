package sub1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

///IO:Input / Output

/*
 * 날짜 : 2023/06/29
 * 이름 : 정채윤 
 * 내용 : Java 파일 입출력 스트림 실습하기 
 * 
 * 입출력 스트림(Stream)
 * 
 * - 프로그램은 데이터 처리와 함께 데이터 저장을 위해 파일 입출력 수행
 * - 파일 입출력을 위해 스트림(데이터 연결 통로) 사용 
 */
public class FileIOTest {

	public static void main(String[] args) {
		String path = "/Users/yun/workspace_lotte/Sample1.txt";
		String target = "/Users/yun/workspace_lotte/Sample2.txt";
		
		try {
			//스트림 생성(연결) 
			///warning :: resourse leak = 메모리 누수. 커넥션 자원을 해제해줘야 함 
			FileInputStream fis = new FileInputStream(path); ///  절대경로를 작성할 때 Mac, Linux 운영체제에서는 폴더 구분자로 /를 사용하지만, 윈도우 운영체제의 경우 \(백슬래시)를 사용한다.
			FileOutputStream fos = new FileOutputStream(target);
			while(true) {
				//파일 읽기
				///읽어들인 데이터는 byte단위이므로 int로 캐스팅이 된다.
				///data가 -1이면 파일의 끝에 도달 
				int data = fis.read();
				if(data == -1) {
					//파일을 모두 읽었을 때 반복 종료 
					break;
				}
				// 숫자를 문자로 변환 (캐스팅) 
				char ch = (char)data;
				System.out.print(ch); ///ASCII코드(서구권)로 변환돼서 한글은 깨짐.Unicode(서구권+아시아권. 전세계 표준) 
				
				//파일 쓰기 
				fos.write(data);
			}
			//스트림 해제 
			fis.close();
			fos.close();
		} catch (FileNotFoundException e) { 
			/// FileNotFoundException :only file 
			/// IOException : read()에러를 잡기 위해 catch절 추가해줌 
			/// 두 클래스 모두  Exception을 상속받으므로 Exception e만 선언해줘도 됨 
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println();
		System.out.println("프로그램 종료...");
	} // main end

}
