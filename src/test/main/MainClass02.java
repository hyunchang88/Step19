package test.main;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/*
 * 	[ InputStreamReader ]
 * 
 * 	- 문자열을 읽어들일때 사용한다.
 * 	- 2 byte 처리 스트림
 * - 한글을 포함한 모든 문자 1글자를 처리할 수 있다.
 */
public class MainClass02 {
	public static void main(String[] args) {
		// 키보드로 부터 입력받을수 있는 객체
		InputStream is = System.in;
		/*
		 * 키보드와 연결된 InputStream 객체의 참조값을 생성자의 인자로
		 * 전달하면서 InputStreamReader 객체 생성하기
		 */
		InputStreamReader isr = new InputStreamReader(is);
		System.out.print("한글자 입력:");
		try{
			int keyCode = isr.read();
			System.out.println("keyCode:"+keyCode);
			char ch = (char) keyCode;
			System.out.println("입력한 글자:"+ch);
		}catch(IOException ie){
			ie.printStackTrace();
		}
	}
}
