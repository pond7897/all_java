public class Exer13B {
    public static void main(String[] args) {
        int[][] X = {{1,2,3},{1,0,2},{2,1,-1}};
        int[][] Y = {{1,2,-1,2},{1,0,2,1},{2,1,-1,3}};
        int[][] Z;
        Z = matrixProduct(X, Y);
        System.out.println("|--Matrix X--|");
        printMatrix(X);
        System.out.println("|--Matrix Y--|");
        printMatrix(Y);
        System.out.println("|--Matrix Z--|");
        printMatrix(Z);
    }

    public static void printMatrix(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++)
                System.out.printf("%2d ", A[i][j]);
            System.out.println();
        }
    }

    public static int[][] matrixProduct(int[][] A, int[][] B) {
        int[][] C = new int[A.length][B[0].length];
        for (int i = 0; i < A.length; i++){
            for (int j = 0; j < B[0].length; j++){
                C[i][j] = 0;
                for (int k = 0; k < B.length; k++){
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return C;
    }
}
