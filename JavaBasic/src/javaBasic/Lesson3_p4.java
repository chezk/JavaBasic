package javaBasic;
import java.io.*;

class Lesson3_p4 {

	public static void main(String[] args) throws IOException
	{
		System.out.println("원주율의 값은 얼마입니까?");
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		double pi = Double.parseDouble(str);
		
		System.out.println("원주율의 값은 " + pi + "입니다.");
	}
}
