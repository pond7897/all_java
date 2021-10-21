class Exer10B
{
	public static void main(String[] args){
		int r,r1,r2,r3;
		r1=remainder(3,2099,7);
		r2 =remainder(555,111,11);
		r3 =remainder(111,555,11);
		r =(r2+r3);
		System.out.println("r1 = "+r1);
		System.out.println("r2 = "+r2);
		System.out.println("r3 = "+r3);
		System.out.println("r2+r3 = "+r);
		
	}
	public static int remainder(int a,int k,int n){
		a = a%n; // 3%7 
		int r= 1;
		for (int i=1 ; i<=k ; i++)
		{
			r = r*a%n; // 3^2099%7
			//System.out.println(r);
		}
		//System.out.println(r);
		return r;
	}
}

