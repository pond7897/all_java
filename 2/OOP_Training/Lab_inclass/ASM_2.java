package lab_inclass;

public class ASM_2 {
	public static void main(String[] args) {
		int sum = 0, number = 0;

		while (number <= 10) {
			sum += number;
			number++;
		}

		System.out.print(sum);
	}
}
