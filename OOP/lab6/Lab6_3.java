package lab6;

public class Lab6_3{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int a = 5; int b = -6; System.out.println(Math.max((Math.abs(b)),a));
		 */
		
		int a = 6;
		System.out.println(method1(a));
		a = 15;
		System.out.println(method1(a));
		a = 10;
		System.out.println(method1(a));
		a = -10;
		System.out.println(method1(a));
		
	}
	public static int method1(int x) {
		if (x <= 10) {
			x += 10;
		}
		else x -= 10;
		return x;
	}

}
