package javaBasic;
import java.io.*;

class MyPoint{
	int x;
	int y;
	
	void setX(int px){
		x = px;
	}
	void setY(int py){
		y = py;
	}
	
	int getX(){
		
		return x;
	}
	
	int getY(){
		return y;
	}
	
}

public class Lesson8_p5 {

	public static void main(String[] args) throws IOException{
		System.out.println("X와 Y의 정수 값을 입력하십시오.");
		MyPoint p1 = new MyPoint();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int numx = Integer.parseInt(br.readLine());
		int numy = Integer.parseInt(br.readLine());
		
		p1.setX(numx);
		p1.setY(numy);
		
		System.out.println("좌표값은  (" + p1.getX() + "," + p1.getY() + ")입니다.");
		
	}

}
