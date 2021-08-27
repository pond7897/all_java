import java.util.Scanner;
class GPA
{
	public static void main(String[] args){
	double sub1,sub2,sub3,sub4,sum;
		Scanner subject = new Scanner(System.in);
		System.out.print("input grade thai"); sub1 = subject.nextDouble();
		System.out.print("input grade math"); sub2 = subject.nextDouble();
		System.out.print("input grade english"); sub3 = subject.nextDouble();
		System.out.print("input grade social"); sub4 = subject.nextDouble();
	sum = (sub1+sub2+sub3+sub4)/4;
		Symtem.out.println("GPA is " +sum);
		
		
	/*Scanner thai = new Scanner(System.in);
	System.out.print("input grade thai:" );
	double sub1 = thai.nextDouble();
	Scanner math = new Scanner(System.in);
	System.out.print("input grade math:" );
	double sub2 = math.nextDouble();
	Scanner eng = new Scanner(System.in);
	System.out.print("input grade eng:" );
	double sub3 = eng.nextDouble();
	Scanner social = new Scanner(System.in);
	System.out.print("input grade social:" );
	double sub4 = social.nextDouble();
	double sum = (sub1+sub2+sub3+sub4)/4;
	System.out.println("GPA = " +sum);*/
	
	
	}
}
