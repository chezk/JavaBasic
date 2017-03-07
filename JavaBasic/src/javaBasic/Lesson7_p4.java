package javaBasic;
import java.io.*;

public class Lesson7_p4 {

	public static void main(String[] args) throws IOException{
		System.out.println("5명의 시험 점수를 입력하십시오");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] test = new int[5];
		int i;
		for(i=0; i<test.length; i++){
			String str = br.readLine();
			test[i] = Integer.parseInt(str);			
		}
		//교재 출력 결과 코드
		for(i=0; i<test.length; i++){
			System.out.println((i+1) + "번째 사람의 점수는 " + test[i] + "입니다.");
		}
		for(int a=0; a<test.length; a++){
			for(int b=a+1; b<test.length; b++){
				if(test[b]>test[a]){
					int tmp = test[b];
					test[b] = test[a];
					test[a] = tmp;
				}
			}
		}
		System.out.println("가장 높은 점수는 " + test[0] + "입니다.");
		
		//합계와 평균 출력 코드
		int sum = 0, avg = 0;
		for(i=0; i<test.length; i++){
			sum += test[i];
			avg = sum/test.length;
		}
		System.out.println(test.length + "명의 합계는" + sum + ", 평균은 " + avg + "입니다.");
	}
}
