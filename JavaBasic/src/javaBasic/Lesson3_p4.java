package javaBasic;
import java.io.*;

class Lesson3_p4 {

	public static void main(String[] args) throws IOException
	{
		System.out.println("�������� ���� ���Դϱ�?");
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		double pi = Double.parseDouble(str);
		
		System.out.println("�������� ���� " + pi + "�Դϴ�.");
	}
}
