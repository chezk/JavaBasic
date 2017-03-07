package javaBasic;
import java.io.*;

class Lesson4_p4 {

	public static void main(String[] args) throws IOException
	{
		System.out.println("삼각형의 및변과 높이를 입력하십시오.");
		BufferedReader len =
				new BufferedReader(new InputStreamReader(System.in));
		int len1 = Integer.parseInt(len.readLine());
		int len2 = Integer.parseInt(len.readLine());
		
		System.out.println("삼각형의 넓이는 " + (double)len1*len2/2 + "입니다.");
	}
}
