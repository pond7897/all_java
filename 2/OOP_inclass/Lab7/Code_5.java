package Lab7;

public class Code_5 {
	public static int method1 (int...values) {
		int mystery = 1;
		for (int i: values) mystery *=i;
		return mystery;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(method1(1,2,3,4,5));
	}

}
