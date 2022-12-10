class Exer9A
{
	public static boolean isprime3(int n){
		if (n== 0)
		{
			return false;
		}
		if (n%2 ==0)
		{
			return false;
		}
			for (int k=3;k*k<=n ;k+=2 )
			{
				if (n%k==0)
				{
					return false;
				}
			}
		return true;
	}
	public static void main(String[] args){
		System.out.printf("list of prime");
		int cnt = 0;
		int n=0;
		for (n = 101; n <= 199 ;n+=2) // between 100 to 200 = 101-199
		{
			if (isprime3(n))
			{
				cnt++;
				System.out.printf(" %d",n);
				
			}

		}
		System.out.println("\ntotal prime between 100 to 200 is : "+cnt);
	}
}