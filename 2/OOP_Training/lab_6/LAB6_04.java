package lab_6;

public class LAB6_04 {
	
	public static int method1(int x) {
		if(x <= 10)
			x += 10;
		else
			x -= 10;
		return x;
	}


	public static void main(String[] args) {
		int a = 15;
		int b = 5;
		System.out.println(method1(method1(a)) + method1(b));
		a = 0;
		b = 0;
		System.out.println(method1(method1(a)) + method1(b));
		a = 5;
		b = 15;
		System.out.println(method1(method1(a)) + method1(b));
		a = -10;
		b = 10;
		System.out.println(method1(method1(a)) + method1(b));
	}

}
