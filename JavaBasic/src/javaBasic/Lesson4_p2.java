package javaBasic;
import java.io.*;

class Lesson4_p2 {
	public static void main(String[] args) throws IOException
	{
		//0-4		
		System.out.println("0-4�� ����� " + (0-4) + "�Դϴ�." );
		
		//3.14x2
		double pi = 3.14;
		int num1 = 2;
		pi = pi*num1;
		System.out.println("3.14x2�� ����� " + pi + "�Դϴ�." );
		
		//5��3	
		double div = (double)5/3;
		System.out.println("5��3�� ����� " + div + "�Դϴ�." );
		
		//30������ 7�� ������ ��
		int div_rest = 30%7;
		System.out.println("30��7�� �������� " + div_rest + "�Դϴ�." );
		
        //(7+32)��5		
		double result = 7+32;
		System.out.println("(7+32)��5�� ����� " + (result/5) + "�Դϴ�");			
	}
}
