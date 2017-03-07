package javaBasic;
import java.io.*;

public class Lesson5_p3 {

	public static void main(String[] args) throws IOException
	{
		System.out.println("2개의 정수를 입력하십시오.");
		BufferedReader input =
				new BufferedReader(new InputStreamReader(System.in));
		
		int num1 = Integer.parseInt(input.readLine());
		int num2 = Integer.parseInt(input.readLine());
		
		if(num1 == num2){
			System.out.println("두 숫자는 같습니다.");
		}
		else if(num1 > num2){
			System.out.println(num2 + "보다 " + num1 + "이(가) 큽니다.");
		}
		else if(num1 < num2){
			System.out.println(num1 + "보다 " + num2 + "이(가) 큽니다.");				
		}
		else{
			System.out.println("error");
		}
	}
}
