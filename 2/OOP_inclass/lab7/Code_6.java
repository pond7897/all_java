package lab7;

public class Code_6 {
	public static int method1 (int values[][]) {
		int mystery = 1;
		for (int i[]: values) for (int j : i)
			mystery *= j;
		return mystery;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[][] = {{3,2,5},{2,2,4,5,6},{1,1}};
		System.out.println(method1(array));
	}

}
