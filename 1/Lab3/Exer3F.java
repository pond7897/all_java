/*read quantity1, price1 // สินค้ารายการที่ 1
 compute amount1 = ราคาของสิ้นค้าชิ้นแรก
 read สินค้ารายการที่ 2
 compute 

 compute TotalAmt = คำนวณมูลค่ำสินค้ำ
 compute Vat = คำนวณภำษีมูลค่ำเพิ่ม
 compute NetAmt = คำนวณมูลค่ำสินค้ำ รวม ภำษีมูลค่ำเพิ่ม
 print NetAmt*/

import java.util.Scanner;

public class Exer3F {
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
    NetAmt = TotalAmt+Vat;

    System.out.println("NetAmt is = "+NetAmt);
  
    kbd.close();
  }
}
