public class Exer15C {
    public static void main(String[] args) {
        System.out.println("fpow(1.5,5) is "+fpow(1.5, 5));
        System.out.println("fpow(2.0,10) is "+fpow(2.0, 10));
        System.out.println("fpow(2.0,16) is "+fpow(2.0, 16));
    }
    public static double fpow(double x,int n) {
        if(n == 0) return 1;
        else return x*fpow(x,n-1);
    }
}
