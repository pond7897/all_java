class Exer11A
{
	public static void main(String[] args){
		int [] X = {10,20,30,40,50,60};
		int [] Y = {10,20,40,30,60,50};
		int [] Z = {10,20,30,40,50,60};
	//check x&y	
		if (equalArrays(X,Y)) System.out.println("X is equals Y");
		else System.out.println("X is not equals Y");
	//check x&z
		if (equalArrays(X,Z)) System.out.println("X is equals Z");
		else System.out.println("X is not equals Z");
	}
	public static boolean equalArrays(int[] A,int[] B){
		for (int i=0;i<A.length ;i++ )
		{
			if (A[i]!=B[i]) return false;
		}
			return true;
	}
}


























