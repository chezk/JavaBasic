package javaBasic;
import java.io.*;

class MyPoint9{
	private int x;
	private int y;
	
	public MyPoint9(){
		x = 0;
		y = 0;
	}
	
	public MyPoint9(int px, int py){
		x = px;
		y = py;
	}
	
	public void setX(int px){
		if(px>=0 && px<=100){
			x = px;			
		}
		else{
			System.out.println(px + "(은)는 올바른 정수 값이 아닙니다. \n 0~100 사이 정수 값을 입력하십시오.");			
		}
	}
	
	public void setY(int py){
		if(py>=0 && py<=100){
			y = py;			
		}
		else{
			System.out.println(py + "(은)는 올바른 정수 값이 아닙니다. \n 0~100 사이 정수 값을 입력하십시오.");			
		}
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
}

class Lesson9_p5 {
	public static void main(String[] args) throws IOException{
		MyPoint p1 = new MyPoint();
		System.out.println("초기 좌표 값은  (" + p1.getX() + "," + p1.getY() + ")입니다.");
		
		System.out.println("X와 Y의 정수 값을 입력하십시오.");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int numx = Integer.parseInt(br.readLine());
		int numy = Integer.parseInt(br.readLine());
		
		MyPoint9 p2 = new MyPoint9(numx, numy);
		p2.setX(numx);
		p2.setY(numy);
		System.out.println("좌표값은  (" + p2.getX() + "," + p2.getY() + ")입니다.");		
	}

}
