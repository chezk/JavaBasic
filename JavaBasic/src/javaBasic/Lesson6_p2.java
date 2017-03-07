package javaBasic;
import java.io.*;

public class Lesson6_p2 {

	public static void main(String[] args) throws IOException{
		System.out.println("시험 점수를 입력하십시오. (0으로 종료)");
		int score=1;
		int sum=0;
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		while(score!=0){
			score = Integer.parseInt(input.readLine());
			sum += score;			
		}
		System.out.println("시험 점수의 합계는 " + sum + "점 입니다.");
	}
}
