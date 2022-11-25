package lab6;

public class Lab6_4{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int a = 5; int b = -6; System.out.println(Math.max((Math.abs(b)),a));
		 */
		
		int a = 15;
		int b = 5;
		System.out.println(method1((method1(a)))+method1(b));
		a = 0;
		b = 0;
		System.out.println(method1((method1(a)))+method1(b));
		a = 5;
		b = 15;
		System.out.println(method1((method1(a)))+method1(b));
		a = -10;
		b = 10;
		System.out.println(method1((method1(a)))+method1(b));
		
	}
	public static int method1(int x) {
		if (x <= 10) {
			x += 10;
		}
		else x -= 10;
		return x;
	}

}
