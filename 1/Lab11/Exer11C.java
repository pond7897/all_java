import java.util.Scanner;
import java.lang.Math;
class Exer11C 
{
    static double[]sc; static int n =10;
    public static void main(String[] args) {
        double []sc = new double[50];
        getScore(sc, n);
        double avg = avgScore(sc, n); double std = sdScore(sc, avg, n);
        System.out.printf("Average %.3f%n",avg);
        System.out.printf("Standard Deviation %.3f",std);
    }
    public static void getScore(double []sc,int n) {
        Scanner kbd = new Scanner(System.in);
        for (int i = 0; i < n ; i++){
            System.out.print("enter score "+(i+1)+": ");
            sc[i]=kbd.nextDouble();
        }
        kbd.close();
    }
    public static double avgScore(double[] sc,int n){
        double sum = 0.0; double avg = 0.0;
        for (int i = 0 ; i<n ;i++){
            sum = sum + sc[i];
        }
        avg = sum/n;
        return avg;
    }
    public static double sdScore(double[] sc,double avg, int n){
        double sum = 0.0; double sd = 0.0; avg = avgScore(sc, n); 
        for (int i = 0;i<n; i++){
            sum = sum + Math.pow((sc[i]-avg),2);
        }
        sd = Math.sqrt((sum)/n);
        return sd;
    } 
}
