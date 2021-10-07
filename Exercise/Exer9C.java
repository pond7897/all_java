import java.math.BigInteger;
class Exer9C
{
	public static void main(String[] args){
		factorial(20);
		factorialBig(20);
	}
	public static void factorial(int n ){
		int fact = 1;
		for (int i =1;i<=n ;i++ )
		{
			fact = fact*i;
			System.out.println(i+"! = "+fact);
		}
	}
	public static void factorialBig(int n ){
		int fact =1;
		int i=1;
		BigInteger fbig = BigInteger.ONE;
		BigInteger ibig;
		for (i = 1;i<=n ;i++ )
		{
			ibig = BigInteger.valueOf(i);
			fbig = fbig.multiply(ibig);
			System.out.println(i+"! = "+fbig);
		}
	}

}
