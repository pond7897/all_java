import javax.swing.JOptionPane;

public class Java10{
	public static void main(String[] args){
		String type;
		String hello , name;
		type = JOptionPane.showInputDialog("Input");
		hello = type.substring(0,5).toUpperCase()+type.substring(5).toLowerCase();
		
		name = hello;
		System.out.println( "Name: " + name);
		System.exit(0);
	}
}
/*import java.util.Scanner;
import java.lang.Math;
public class Exercise3F {
  public static void main(String[] args) {
    int quantity1,quantity2;
    double amount1,amount2,price1,price2;
    double TotalAmt,Vat,NetAmt;
    
    Scanner kbd = new Scanner(System.in);
    System.out.print("Enter quantity1 :"); quantity1 = kbd.nextInt();
    System.out.print("Enter price1 :");    price1 = kbd.nextDouble();
    System.out.print("Enter quantity2 :"); quantity2 = kbd.nextInt();
    System.out.print("Enter price2 :");    price2 = kbd.nextDouble();
    
    amount1 = quantity1*price1;
    amount2 = quantity2*price2;
    
    TotalAmt = (amount1)*(amount2);
    Vat = (7.0/100.0)*TotalAmt;
    //System.out.println(Vat);
    NetAmt = TotalAmt+Vat;
    System.out.println("NetAmt is = "+NetAmt);
  }
}
*/
