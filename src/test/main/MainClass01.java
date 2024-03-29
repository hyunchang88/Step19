package test.main;

import java.io.IOException;
import java.io.InputStream;

/*
 *  	[ Input Stream ]
 *  
 *  	- 1byte 처리 스트림
 *  	- 문자의 경우에는 영문자 대소문자, 숫자, 특수 문자 한글자를 읽어들일 수 있다.
 *   	- 한글은 처리 불가 (1byte는 256 가지만 처리할 수 있는데 그안에 한글까지 포함이 안돼. 한글까지 처리하려면 2바이트로)
 */
public class MainClass01 {
	public static void main(String[] args) {
		// 키보드로 부터 입력 받을 수 있는 객체의 참조값 얻어와서 변수에 담기
		InputStream is = System.in;
		System.out.print("한글자 입력: ");
		
		try{
			// 입력한 키의 코드값을 읽어온다.
			int keyCode = is.read();
			System.out.println("keyCode: "+keyCode);
			// 코드에 해당하는 문자를 얻어내기
			char ch = (char)keyCode;
			System.out.println("char type 으로 변환한값: "+ch);
		} catch(IOException e){
			e.printStackTrace();
		}
		
	}
}




