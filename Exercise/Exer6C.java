import java.util.Scanner;
class Exer6C
{
	public static double getDouble(String msg){
		Scanner kbd = new Scanner(System.in);
		System.out.print(msg); double d = kbd.nextDouble();
	return d;
	}
	public static double funcX(double x) {
		double f = 0.0;
		if (x>=20) {
			f = ((3.0*Math.pow(x,3))+(2.0*x))/(Math.pow(x,2)+1.0);
		}
		else if (x>10.5 && x<20){
			f = (Math.pow(x,2)+1.0)/(x+1.0);
		}
		else if (x>0 && x<=10.5){
			f = (1.0-x)/(Math.pow(x,2)+1.0);
		}
		else if (x<=0){
			f = Math.abs(x-2)+5.0;
		}
		return f;
	}
	
	public static void main(String[] args){
		double x,y;
		x = getDouble("Enter X-value : ");
		y = funcX(x);
		System.out.println(" Result is : " +y);
	}
}
