package javaBasic;

class Car
{
	private int num;
	private double gas;
	
	public Car(){
		num = 0;
		gas = 0.0;
		System.out.println("자동차가 만들어졌습니다.");
	}

	public void setCar(int n, double g){
		num = n;
		gas = g;
		System.out.println("차량 번호를 " + num + "(으)로, 연료 양을 " + gas + "로 바꾸었습니다.");
	}
	public String toString(){
		String str = "차량번호 " + num + " 연료 양 " + gas + "인 자동차입니다.";
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
