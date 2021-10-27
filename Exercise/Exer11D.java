import java.util.Scanner;
class Exer11D {
    static double[]sc; static int[]tally = new int[11];
    public static void main(String[] args) {
       int []T = new int[10];
        
        n = getScore(sc);
        tallyScore(n, T, sc);
        
        
    }
    public static int getScore(double []sc) {
        int k = 0;
        Scanner kbd = new Scanner(System.in);
        System.out.print("input score : "); double score = kbd.nextDouble();
        while(score>=0.0 && k<sc.length){
            sc[k] = score; 
            k++;
            System.out.print("input score : ");
            sc[k] = kbd.nextDouble();
        }
         kbd.close();
         return k;
    }
    public static void tallyScore(int n,int[] T,double []sc){
         /* 0: 0
         1: 1-10 -> count = 10
         2: 11-20
            ...
        10: 91-100
         */
        int k = 0;
        int i = (int)(sc[k]/10.0);
        for (k = 0; k<n ; k++){
            if ( sc[i] >= 91) i = 10;
            else if ( sc[i] >= 81) i = 9;
            else if ( sc[i] >= 71) i = 8;
            else if ( sc[i] >= 61) i = 7;
            else if ( sc[i] >= 51) i = 6;
            else if ( sc[i] >= 41) i = 5;
            else if ( sc[i] >= 31) i = 4;
            else if ( sc[i] >= 21) i = 3;
            else if ( sc[i] >= 11) i = 2;
            else if ( sc[i] >= 1) i = 1;
            else i = 0;
            T[k] = T[k]+1;
        }
    }
}

