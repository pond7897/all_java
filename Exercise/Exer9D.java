class Exer9D {
	public static void main(String[] args){
			findxy(5,7);
			findxy(10,14);
			findxy(15,21);
	}
	public static int gcd(int a,int b){
		int r;
		a = Math.abs(a); b = Math.abs(b);
		while (b>0)
		{
			r = a%b;
			a = b; b=r;
		}
		return a;
	}
	public static void findxy(int a,int b){
		//find d = gcd(a,b) ?
		int d = gcd(a,b);
		for (int x = -b; x<=b ; x++ )
		{
			for (int y =-a; y<=a ;y++ )
			{
				if ((a*x)+(b*y) == d)
				{
					System.out.printf("x = %d ",x);
					System.out.printf("y = %d \n ----- \n",y);
				}
				//System.out.printf("%d",y);
			}
			//System.out.printf(" %d",x);	
		} 
	}
}
