package javaBasic;
import java.io.*;

class Lesson10_p2 {

	public static void main(String[] args) throws IOException{
		System.out.println("���ڿ��� �Է��Ͻʽÿ�.");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		
		System.out.println(str + "�� �Ųٷ� ������ " + sb + "�Դϴ�.");
	}
}
