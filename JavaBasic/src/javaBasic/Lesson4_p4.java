package javaBasic;
import java.io.*;

class Lesson4_p4 {

	public static void main(String[] args) throws IOException
	{
		System.out.println("�ﰢ���� �׺��� ���̸� �Է��Ͻʽÿ�.");
		BufferedReader len =
				new BufferedReader(new InputStreamReader(System.in));
		int len1 = Integer.parseInt(len.readLine());
		int len2 = Integer.parseInt(len.readLine());
		
		System.out.println("�ﰢ���� ���̴� " + (double)len1*len2/2 + "�Դϴ�.");
	}
}
