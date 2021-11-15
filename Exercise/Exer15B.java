public class Exer15B {
    public static void main(String[] args) {
        System.out.println("sum(10) is "+ sum(10));
        System.out.println("sum(100) is "+sum(100));
    }
    public static int sum(int n){
        if( n == 1) return 1;
        else return sum(n-1)+n;
    }
}

