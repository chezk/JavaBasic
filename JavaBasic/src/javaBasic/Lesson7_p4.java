package javaBasic;
import java.io.*;

public class Lesson7_p4 {

	public static void main(String[] args) throws IOException{
		System.out.println("5���� ���� ������ �Է��Ͻʽÿ�");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] test = new int[5];
		int i;
		for(i=0; i<test.length; i++){
			String str = br.readLine();
			test[i] = Integer.parseInt(str);			
		}
		//���� ��� ��� �ڵ�
		for(i=0; i<test.length; i++){
			System.out.println((i+1) + "��° ����� ������ " + test[i] + "�Դϴ�.");
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
		System.out.println("���� ���� ������ " + test[0] + "�Դϴ�.");
		
		//�հ�� ��� ��� �ڵ�
		int sum = 0, avg = 0;
		for(i=0; i<test.length; i++){
			sum += test[i];
			avg = sum/test.length;
		}
		System.out.println(test.length + "���� �հ��" + sum + ", ����� " + avg + "�Դϴ�.");
	}
}
