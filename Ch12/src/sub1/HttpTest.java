package sub1;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/*
 * 날짜 : 2023/07/06
 * 이름 : 정채윤
 * 내용 : HTTP 통신 실습하기 
 */
public class HttpTest {
	public static void main(String[] args) {
		
		FileOutputStream fos = null; ///파일에 기록을 하기 위한 스트림(문자) 
		BufferedReader br = null;
		
		try {
			URL url = new URL("https://google.com");
			
			br = new BufferedReader(new InputStreamReader(url.openStream()));
			fos = new FileOutputStream("./Result.html");
			
			String line = null;
			
			while((line = br.readLine()) != null) { /// -1 / 이건 문자스트림으로 읽어들여서 null 체크 
				System.out.println(line);
				fos.write(line.getBytes());
			}
			
			br.close();
			fos.close();
			
		} catch (MalformedURLException e) { ///잘못된 URL일 경우
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료...");
		 
	}
}
