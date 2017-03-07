package javaBasic;
import java.io.*;

public class Lesson5_p2 {

	public static void main(String[] args) throws IOException
	{
		System.out.println("정수를 입력하십시오.");
		BufferedReader input =
				new BufferedReader(new InputStreamReader(System.in));
		String str = input.readLine();
		int num = Integer.parseInt(str);
		int rest = num%2;
		
		if(rest == 0){
			System.out.println(num + "(은)는 짝수입니다");
		}
		else{
			System.out.println(num + "(은)는 홀수입니다");
		}
	}
}
