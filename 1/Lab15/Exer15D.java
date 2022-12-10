public class Exer15D {
    public static void main(String[] args) {
        System.out.println("sum(10) is : "+sum(10));
        System.out.println("sum(20) is : "+sum(20));
    }
    public static int sum(int n) {
        if(n==0) return 1;
        else return sum(n-1)+2; //1,3,5,7,9,11,...,2n+1:
        
    }
}
