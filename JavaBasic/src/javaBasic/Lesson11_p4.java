package javaBasic;

class Car
{
	private int num;
	private double gas;
	
	public Car(){
		num = 0;
		gas = 0.0;
		System.out.println("�ڵ����� ����������ϴ�.");
	}

	public void setCar(int n, double g){
		num = n;
		gas = g;
		System.out.println("���� ��ȣ�� " + num + "(��)��, ���� ���� " + gas + "�� �ٲپ����ϴ�.");
	}
	public String toString(){
		String str = "������ȣ " + num + " ���� �� " + gas + "�� �ڵ����Դϴ�.";
		return str;
	}
}

class Lesson11_p4{
	public static void main(String[] args) {
		Car car1 = new Car();
		car1.setCar(1234, 20.5);
		System.out.println(car1);
	}
}
