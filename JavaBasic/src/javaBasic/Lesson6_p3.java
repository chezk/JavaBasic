package javaBasic;

public class Lesson6_p3 {

	public static void main(String[] args) {
		int i, j, val=0;
		for(i=1; i<=9; i++){
			for(j=1; j<=9; j++){
				val = i*j;
				System.out.print(val + "\t");
			}System.out.print("\n");					
		}
	}
}
