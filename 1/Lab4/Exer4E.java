import java.util.Scanner;

class Exer4E {
  public static void main(String[] args) {
    double x1, y1;
    double x2, y2; 
    
    Scanner kbd = new Scanner(System.in);
    System.out.print("input x1 : "); x1 = kbd.nextDouble();
    
    y1 = Math.log10(3.0 * (x1 * x1)) + (2.0 / 3.0) * (x1 * x1 * x1) + Math.sin(2 * x1);
    System.out.println("value of function :" + y1);

    System.out.print("input x2 : "); x2 = kbd.nextDouble();
    y2 = Math.log10(3.0 * (x2 * x2)) + (2.0 / 3.0) * (x2 * x2 * x2) + Math.sin(2 * x2);
    
    System.out.println("value of function :" + y2);
    System.out.println("Max function : " + Math.max(x1, x2));
    
    kbd.close();
  }
}
