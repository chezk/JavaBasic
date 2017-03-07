package javaBasic;
import java.io.*;

class Lesson4_p3 {

	public static void main(String[] args) throws IOException
	{
		System.out.println("정사각형의 한 변의 길이를 입력하십시오.");
		
		BufferedReader len = 
				new BufferedReader(new InputStreamReader(System.in));
		String str = len.readLine();
		int num = Integer.parseInt(str);
		num *= num;
		
		System.out.println("정사각형의 넓이는 " + num + "입니다.");
	}
}
