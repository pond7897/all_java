class Exer7A2
{
	public static void main(String[] args){
		int k,p;
			k = 5;
			switch (k)
			{
			case 1: case 3:
				p = 1; break;
			case 2: case 4:
				p = 2; break;
			case 5:
				p = 3; break;
			default :
				p = 4; 
			}
		System.out.println("p = "+p);
	}
}