package sub2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 날짜 : 2023/06/29
 * 이름 : 정채윤 
 * 제목 : Java 버퍼 입출력 스트림 실습하기 
 */
public class BufferIOTest2 {

	public static void main(String[] args) {
		String path = "/Users/yun/workspace_lotte/workspace_lotte.zip";
		String target =  "/Users/yun/workspace_lotte/workspace_lotte2.zip";
		
		try {
			//스트림 생성(연결)
			FileInputStream fis = new FileInputStream(path);
			FileOutputStream fos = new FileOutputStream(target);
			
			byte[] buf = new byte[8192];
			 
			while(true) {
				//파일 읽기
				int data = fis.read();
				if(data == -1) {
					//파일을 모두 읽었을 때 반복 종료
					break;
				}
				char ch = (char) data;
				System.out.println(ch);
				
				//파일 쓰기
				fos.write(data);
			}
			//스트림 해제 
			fis.close();
			fos.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println();
		System.out.println("프로그램 종료...");
	}

}
