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
			System.out.println(px + "(��)�� �ùٸ� ���� ���� �ƴմϴ�. \n 0~100 ���� ���� ���� �Է��Ͻʽÿ�.");			
		}
	}
	
	public void setY(int py){
		if(py>=0 && py<=100){
			y = py;			
		}
		else{
			System.out.println(py + "(��)�� �ùٸ� ���� ���� �ƴմϴ�. \n 0~100 ���� ���� ���� �Է��Ͻʽÿ�.");			
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
		System.out.println("�ʱ� ��ǥ ����  (" + p1.getX() + "," + p1.getY() + ")�Դϴ�.");
		
		System.out.println("X�� Y�� ���� ���� �Է��Ͻʽÿ�.");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int numx = Integer.parseInt(br.readLine());
		int numy = Integer.parseInt(br.readLine());
		
		MyPoint9 p2 = new MyPoint9(numx, numy);
		p2.setX(numx);
		p2.setY(numy);
		System.out.println("��ǥ����  (" + p2.getX() + "," + p2.getY() + ")�Դϴ�.");		
	}

}
