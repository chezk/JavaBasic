package javaBasic;
import java.io.*;

class Lesson10_p3 {

	public static void main(String[] args) throws IOException{
		System.out.println("���ڿ��� �Է��Ͻʽÿ�.");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		
		System.out.println("a�� �� ��ġ�� ������ �Է��Ͻʽÿ�.");
		String str2 = br.readLine();		
		int num = Integer.parseInt(str2);
		
		StringBuffer sb = new StringBuffer(str1);
		sb.insert(num, "a");
		
		System.out.println(sb + "�� �Ǿ����ϴ�.");
	}
}
