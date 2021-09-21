import java.util.Scanner;
class Exercise5C
{
	private static double getDouble(String msg){
	Scanner kbd = new Scanner(System.in);
	System.out.print(msg); double num = kbd.nextDouble();
	return num;
	}
	public static double totalAmt(double P,double i,double n){
		double tot,sqr;
		sqr = Math.pow((1+i/100),n);
		tot = P*(sqr);
		return tot;
	}
	public static void main(String[] args){
		double p,r,n,tamt;
		p = getDouble("Principle Amount :");
		r = getDouble("Interest Rate :");
		n = getDouble("Number of year :");
		tamt = totalAmt(p,r,n);
		System.out.println("Total Amount is : "+tamt);
	}
}
//Titipong Keawkhum 64050407