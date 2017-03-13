package javaBasic;
import java.io.*;

class Lesson10_p2 {

	public static void main(String[] args) throws IOException{
		System.out.println("문자열을 입력하십시오.");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		
		System.out.println(str + "를 거꾸로 읽으면 " + sb + "입니다.");
	}
}
