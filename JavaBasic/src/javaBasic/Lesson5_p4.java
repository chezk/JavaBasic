package javaBasic;
import java.io.*;

public class Lesson5_p4 {

	public static void main(String[] args) throws IOException
	{
		System.out.println("0에서 10까지의 수를 입력하십시오");
		BufferedReader input =
				new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(input.readLine());
		
		if(num >= 0 && num <= 10){
			System.out.println("정답입니다.");
		}
		else{
			System.out.println("오답입니다.");		
		}
	}
}
