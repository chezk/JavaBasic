package javaBasic;
import java.io.*;

public class Lesson4_p5 {

	public static void main(String[] args) throws IOException
	{
		System.out.println("���� 1~5�� ������ ������ �Է��Ͻʽÿ�.");
		BufferedReader score =
				new BufferedReader(new InputStreamReader(System.in));
		int score1 = Integer.parseInt(score.readLine());
		int score2 = Integer.parseInt(score.readLine());
		int score3 = Integer.parseInt(score.readLine());
		int score4 = Integer.parseInt(score.readLine());
		int score5 = Integer.parseInt(score.readLine());
		int sum = score1+score2+score3+score4+score5;
		
		System.out.println("5������ �հ�� " + sum + "���Դϴ�.");
		System.out.println("5������ ����� " + (double)sum/5 + "���Դϴ�.");
	}
}
