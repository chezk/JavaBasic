package javaBasic;
import java.io.*;

class Lesson3_p3 {

	public static void main(String[] args) throws IOException 
	{
		System.out.println("당신은 몇 살입니까?");
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int age = Integer.parseInt(str);
		
		System.out.println("당신은 " + age + "살입니다.");

	}

}
