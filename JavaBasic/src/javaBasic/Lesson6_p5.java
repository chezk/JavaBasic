package javaBasic;
import java.io.*;

public class Lesson6_p5 {

	public static void main(String[] args) throws IOException{
		System.out.println("2 �̻��� ������ �Է��Ͻʽÿ�.");
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int val = Integer.parseInt(input.readLine());
		for(int i=2; i<=val; i++){
			if(i==val){
				System.out.println(val + "�� �Ҽ��Դϴ�.");
			}
			else if(val%i==0){		
				System.out.println(val + "�� �Ҽ��� �ƴմϴ�.");	
				break;
			}
		}
	}
}
