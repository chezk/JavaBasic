package javaBasic;
import java.io.*;

class Lesson4_p3 {

	public static void main(String[] args) throws IOException
	{
		System.out.println("���簢���� �� ���� ���̸� �Է��Ͻʽÿ�.");
		
		BufferedReader len = 
				new BufferedReader(new InputStreamReader(System.in));
		String str = len.readLine();
		int num = Integer.parseInt(str);
		num *= num;
		
		System.out.println("���簢���� ���̴� " + num + "�Դϴ�.");
	}
}
