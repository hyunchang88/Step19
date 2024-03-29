package test.main;

import java.io.IOException;
import java.io.OutputStream;

public class MainClass04 {
	public static void main(String[] args) {
		// 콘솔에 출력할 수 있는 객체의 참조값을
		// OutputStream type 변수에 담기
		OutputStream os = System.out;
		
		try {
			os.write(97); // 출력할 준비
			os.write(98);
			os.write(99);
			os.write(100);
			os.flush(); // 방출(출력)
			
			// byte[] 배열 객체를 만들고
			byte[] buffer = {65, 66, 67, 68};
			// write() 메소드 호출하면서 배열의 참조값 전달하기
			os.write(buffer);
			os.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
//
//		try {
//			byte[] buffer = {65, 66, 67, 68};
//			os.write(buffer, 1, 2);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
	}
}
