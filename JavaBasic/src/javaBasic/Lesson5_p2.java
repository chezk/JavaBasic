package javaBasic;
import java.io.*;

public class Lesson5_p2 {

	public static void main(String[] args) throws IOException
	{
		System.out.println("������ �Է��Ͻʽÿ�.");
		BufferedReader input =
				new BufferedReader(new InputStreamReader(System.in));
		String str = input.readLine();
		int num = Integer.parseInt(str);
		int rest = num%2;
		
		if(rest == 0){
			System.out.println(num + "(��)�� ¦���Դϴ�");
		}
		else{
			System.out.println(num + "(��)�� Ȧ���Դϴ�");
		}
	}
}
