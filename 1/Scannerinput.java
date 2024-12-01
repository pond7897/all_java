import java.util.Scanner;

public class Scannerinput {
  public static void main(String[] args) {
    double a, b;
    
    Scanner kbd = new Scanner(System.in);
    System.out.print("Enter 1stnumber: ");
    a = kbd.nextDouble(); // 1
    
    System.out.print("Enter 2ndnumber:");
    b = kbd.nextDouble(); // 2
    
    System.out.println("Add       :" + (a + b));
    System.out.println("Subtract: " + (a - b));
    System.out.println("Multiply : " + (a * b));
    System.out.println("Division : " + (a / b));

    kbd.close();
  }
}
