package javaBasic;
import java.io.*;

public class Lesson5_p5 {

	public static void main(String[] args) throws IOException
	{
		System.out.println("������ �Է��Ͻʽÿ�");
		BufferedReader input =
				new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(input.readLine());
		
		switch(num){
			case 1 :
				System.out.println("����սô�.");
				break;
			case 2 :
				System.out.println("���� �� ����սô�.");
				break;
			case 3 :
				System.out.println("�� ���� ������ ��ǥ�� �սô�.");
				break;
			case 4 :
				System.out.println("�ſ� ���߽��ϴ�.");
				break;
			case 5 :
				System.out.println("�ſ� ����մϴ�.");
				break;
			default :
				System.out.println("1���� 5 ������ ������ �Է��Ͻʽÿ�.");
				break;
		}
	}
}
