package javaBasic;
import java.io.*;

public class Lesson5_p4 {

	public static void main(String[] args) throws IOException
	{
		System.out.println("0���� 10������ ���� �Է��Ͻʽÿ�");
		BufferedReader input =
				new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(input.readLine());
		
		if(num >= 0 && num <= 10){
			System.out.println("�����Դϴ�.");
		}
		else{
			System.out.println("�����Դϴ�.");		
		}
	}
}
