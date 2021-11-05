import java.util.Scanner;
class Exer11D {
    static double[] sc;
    static int[] tally = new int[11];
    
    public static void main(String[] args) {
        int[] T = new int[11];
        double[] sc = new double[100];
        int n = getScore(sc);
        tallyScore(n, T, sc);
        showTally(T);
    }
    public static int getScore(double[] sc) {
        int k = 0;
        Scanner kbd = new Scanner(System.in);
        System.out.print("input score : ");
        double score = kbd.nextDouble();
        while (score >= 0.0 && k < sc.length) {
            sc[k] = score;
            k++;
            System.out.print("input score : ");
            score = kbd.nextDouble();
        }
        kbd.close();
        return k;
    }
    public static void tallyScore(int n, int[] T, double[] sc) {
        /*
         * 0: 0 
         * 1: 1-10 -> count = 10 
         * 2: 11-20 
         * ... 
         * 10: 91-100
         */
        int k = 1;
        int i = (int) (sc[k] / 10.0);
        for (k = 0; k < n; k++) {
            if (sc[k] >= 91)
                i = 10;
            else if (sc[k] >= 81)
                i = 9;
            else if (sc[k] >= 71)
                i = 8;
            else if (sc[k] >= 61)
                i = 7;
            else if (sc[k] >= 51)
                i = 6;
            else if (sc[k] >= 41)
                i = 5;
            else if (sc[k] >= 31)
                i = 4;
            else if (sc[k] >= 21)
                i = 3;
            else if (sc[k] >= 11)
                i = 2;
            else if (sc[k] >= 1)
                i = 1;
            else
                i = 0;
            T[i] = T[i] + 1;
        }
    }
    public static void showTally(int[] T) {
        for (int k = 10; k >= 1; k--) {
            if (k <= 0 && k > 100)
                System.out.printf("%3d:  %3d - %3d   :%3d\n", k, 0, 10, T[k]);
            else
                System.out.printf("%3d:  %3d - %3d   :%3d\n", k, ((k - 1) * 10) + 1, (k) * 10, T[k]);
        }
    }
}
