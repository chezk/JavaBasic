package javaBasic;
import java.io.*;

class Lesson4_p2 {
	public static void main(String[] args) throws IOException
	{
		//0-4		
		System.out.println("0-4의 결과는 " + (0-4) + "입니다." );
		
		//3.14x2
		double pi = 3.14;
		int num1 = 2;
		pi = pi*num1;
		System.out.println("3.14x2의 결과는 " + pi + "입니다." );
		
		//5÷3	
		double div = (double)5/3;
		System.out.println("5÷3의 결과는 " + div + "입니다." );
		
		//30나누기 7의 나머지 값
		int div_rest = 30%7;
		System.out.println("30÷7의 나머지는 " + div_rest + "입니다." );
		
        //(7+32)÷5		
		double result = 7+32;
		System.out.println("(7+32)÷5의 결과는 " + (result/5) + "입니다");			
	}
}
