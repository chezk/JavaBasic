package javaBasic;
import java.io.*;

public class Lesson5_p3 {

	public static void main(String[] args) throws IOException
	{
		System.out.println("2���� ������ �Է��Ͻʽÿ�.");
		BufferedReader input =
				new BufferedReader(new InputStreamReader(System.in));
		
		int num1 = Integer.parseInt(input.readLine());
		int num2 = Integer.parseInt(input.readLine());
		
		if(num1 == num2){
			System.out.println("�� ���ڴ� �����ϴ�.");
		}
		else if(num1 > num2){
			System.out.println(num2 + "���� " + num1 + "��(��) Ů�ϴ�.");
		}
		else if(num1 < num2){
			System.out.println(num1 + "���� " + num2 + "��(��) Ů�ϴ�.");				
		}
		else{
			System.out.println("error");
		}
	}
}
