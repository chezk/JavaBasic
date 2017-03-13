package javaBasic;
import java.io.*;

class Lesson10_p4 {

	public static void main(String[] args) throws IOException{
		System.out.println("정수를 2개 입력하십시오.");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		String str2 = br.readLine();
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		
		int ans = Math.min(num1, num2);
		
		System.out.println(num1 + "와(과) " + num2 + "중 작은 쪽은" + ans + "입니다.");
	}
}
