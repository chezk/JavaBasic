package javaBasic;
import java.io.*;

class Lesson3_p3 {

	public static void main(String[] args) throws IOException 
	{
		System.out.println("����� �� ���Դϱ�?");
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int age = Integer.parseInt(str);
		
		System.out.println("����� " + age + "���Դϴ�.");

	}

}
