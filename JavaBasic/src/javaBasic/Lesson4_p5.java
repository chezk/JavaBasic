package javaBasic;
import java.io.*;

public class Lesson4_p5 {

	public static void main(String[] args) throws IOException
	{
		System.out.println("과목 1~5의 점수를 정수로 입력하십시오.");
		BufferedReader score =
				new BufferedReader(new InputStreamReader(System.in));
		int score1 = Integer.parseInt(score.readLine());
		int score2 = Integer.parseInt(score.readLine());
		int score3 = Integer.parseInt(score.readLine());
		int score4 = Integer.parseInt(score.readLine());
		int score5 = Integer.parseInt(score.readLine());
		int sum = score1+score2+score3+score4+score5;
		
		System.out.println("5과목의 합계는 " + sum + "점입니다.");
		System.out.println("5과목의 평균은 " + (double)sum/5 + "점입니다.");
	}
}
