package javaBasic;
import java.io.*;

public class Lesson6_p2 {

	public static void main(String[] args) throws IOException{
		System.out.println("���� ������ �Է��Ͻʽÿ�. (0���� ����)");
		int score=1;
		int sum=0;
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		while(score!=0){
			score = Integer.parseInt(input.readLine());
			sum += score;			
		}
		System.out.println("���� ������ �հ�� " + sum + "�� �Դϴ�.");
	}
}
