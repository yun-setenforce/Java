package sub2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

/*
 * 날짜 : 2023/07/06
 * 이름 : 정채윤 
 * 내용 : 소켓 프로그래밍 실습하기 
 */

public class SocketClient {
	public static void main(String[] args) {
	
		System.out.println("[Client]");
		
		///클라이언트라서 그냥 socket. serversocket아
		
		Socket socket = null;
		
		try {
			socket = new Socket();
			
			System.out.println("연결 요청...");
			socket.connect(new InetSocketAddress("127.0.0.1", 5001));
			
			System.out.println("연결 성공...");
			
			//데이터 전송(Client ->Server)
			OutputStream os = socket.getOutputStream();
			String msg = "Hello Server";
			
			byte[] msgBytes = msg.getBytes(); ///문자열을 byte배열로 변환 
			os.write(msgBytes);
			os.flush();
			System.out.println("데이터 송신 완료...");
			
			// 데이터 수 (Server -> Client)
			InputStream is = socket.getInputStream();
			byte[] bytes = new byte[100];
			int readBytes = is.read(bytes); ///읽어온 데이터는 숫자 데이터이므로 문자로 변환이 필요 
			
			String result = new String(bytes, 0, readBytes, "UTF-8");
			System.out.println(result);
			
			System.out.println("데이터 수신 완료...");
			
			os.close();
			is.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		if(!socket.isClosed()) {
			try {
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Client 종료...");
	}
}
