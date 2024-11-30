package lab_6;

public class LAB6_03 {
	
	public static int method1(int x) {
		if(x <= 10)
			x += 10;
		else
			x -= 10;
		return x;
	}
	public static void main(String[] args) {
		int a = 6;
		System.out.println(method1(a));
		a = 15;
		System.out.println(method1(a));
		a = 10;
		System.out.println(method1(a));
		a = -10;
		System.out.println(method1(a));
	}

}
