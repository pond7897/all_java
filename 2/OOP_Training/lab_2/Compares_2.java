package lab_2;

import java.util.ArrayList;

public class Compares_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int x = 3;
		 * int y = 9;
		 * int z = 77;
		 * if ( z == 77 ) System.out.print("H");
		 * if ( z == 99 ) System.out.print("M");
		 * if ( z < x ) System.out.print("J");
		 * System.out.print("E");
		 * if ( y == (x*x) ) System.out.print("LL");
		 * System.out.print("O");
		 * if ( x == y ) System.out.print("W");
		 */

		int[] arr = { 1, 2, 3, 4, 5 };
		for (int i : arr) {
			System.out.println(i);
		}

		ArrayList<Integer> arrList = new ArrayList<Integer>();
		int j = 0;
		while (j <= 5) {
			arrList.add(j);
			j++;

		}
		System.out.println(arrList);

	}

}
