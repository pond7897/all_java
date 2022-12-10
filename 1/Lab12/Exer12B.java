class Exer12B {
    public static void main(String[] args) {
        int[][] X = { { 1, 2, 3 }, { 0, 5, 6 }, { 0, 0, 0 } };
        int[][] Y;
        printMatrix(X);
        if (lowerTriangular(X))
            System.out.println("X is lower traiangular");
        else
            System.out.println("X is not lower traiangular");
        Y = transposeMatrix(X);

        printMatrix(Y);

        if (lowerTriangular(Y))
            System.out.println("Y is lower traiangular");
        else
            System.out.println("Y is not lower traiangular");
    }

    public static boolean lowerTriangular(int[][] M) {
        for (int i = 0; i < M.length; i++)
            for (int j = i + 1; j < M[0].length; j++)
                if (M[i][j] == 0)
                    return true;
        return false;
    }

    public static int[][] transposeMatrix(int[][] M) {
        int[][] x = new int[M[0].length][M.length];
        for (int i = 0; i < M.length; i++)
            for (int j = i; j < M[0].length; j++)
                x[j][i] = M[i][j];
        return x;
    }

    public static void printMatrix(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
        // System.out.println();
    }

}
