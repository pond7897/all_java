public class Exer15A {
    public static void main(String[] args) {
      System.out.printf("fact(15) is : %,d%n",fact(15));
      System.out.printf("face(20) is : %,d%n",fact(20));
    }
    public static long fact(long n){
        if (n == 0) return 1;
        else return n*fact(n-1);
    }
}