package javaBasic;
import java.io.*;

class Lesson3_p5 {

	public static void main(String[] args) throws IOException 
	{
		System.out.println("Ű�� �����Ը� �Է��Ͻʽÿ�.");
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		String str2 = br.readLine();
		
		Double height = Double.parseDouble(str1);
		Double weight = Double.parseDouble(str2);
		
		System.out.println("Ű�� " + height + "��Ƽ�����Դϴ�." );		
		System.out.println("�����Դ� " + weight + "ų�α׷��Դϴ�." );
	}
}
