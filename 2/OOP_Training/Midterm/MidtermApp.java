package Midterm;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
public class MidtermApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of Array: "); int number = input.nextInt();
		mainExtended(number);
		System.out.print("End programe");
		input.close();
	}
	public static int[] mainExtended(int number) {
		Random ran = new Random();
		int[] arr = new int[number];
		
		System.out.println("Array is : ");
		for (int i = 0 ; i<arr.length ; i++) {
			arr[i] = ran.nextInt(100);
		}
		for (int j : arr) {
			System.out.println(j);
		}
		System.out.println("Array with sorting is :");
		Arrays.sort(arr);
		for (int k : arr) {
			System.out.println(k);
		}
		return arr;
	}

}
