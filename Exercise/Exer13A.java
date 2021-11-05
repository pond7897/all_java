import java.util.*;

public class Exer13A {
    public static Scanner inp;
    public static int rowUsed;
    public static int colUsed;

    public static void main(String[] args) {
        int[][] table;

        // int rowsUsed,colsUsed;
        // rowUsed = 10; colUsed = 8;
        table = new int[10][8];
        inp = new Scanner(System.in);
        System.out.print("Enter # row : ");
        rowUsed = inp.nextInt();
        System.out.print("Enter # column : ");
        colUsed = inp.nextInt();
        table = new int[rowUsed][colUsed];
        getTable(inp, table, rowUsed, colUsed);
        System.out.println("------------");
        System.out.println(rowUsed + " " + colUsed);
        printTable(table);
        System.out.println("------------");
        int max = FindLarge(table);
        System.out.println("Largest value is : " + max);
        System.out.println("------------");
        for (int i = 0; i < colUsed; i++)
            System.out.println("Sum of Column " + (i + 1) + " is " + sumColumn(table, i));

    }

    public static void getTable(Scanner inp, int[][] T, int rowUsed, int colUsed) {
        System.out.println("input number ");
        for (int i = 0; i < rowUsed; i++) {
            for (int j = 0; j < colUsed; j++) {
                T[i][j] = inp.nextInt();
            }
        }
        inp.close();
    }

    public static void printTable(int[][] T) {
        for (int i = 0; i < T.length; i++) {
            for (int j = 0; j < T[0].length; j++)
                System.out.print(T[i][j] + " ");
            System.out.println();
        }
    }

    public static int FindLarge(int[][] T) {
        int max = T[0][0];
        for (int i = 0; i < rowUsed; i++) {
            for (int j = 0; j < colUsed; j++)
                if (T[i][j] > max)
                    max = T[i][j];
        }
        return max;
    }

    public static int sumColumn(int[][] A, int col) {
        int sum = 0;
        for (int i = 0; i < A.length; i++)
            sum = sum + A[i][col];
        return sum;
    }
}
