class Exer12A {
    public static void main(String[] args) {
        int MAX_ROWS, MAX_COLS, rowsUsed, colsUsed;
        MAX_ROWS = 10;
        MAX_COLS = 10;
        rowsUsed = 5;
        colsUsed = 5;
        char[][] table = new char[MAX_COLS][MAX_ROWS];
        int row, column;
        for (column = 0; column < MAX_COLS; column++) {
            for (row = 0; row < MAX_ROWS; row++) {
                table[row][column] = '*';
            }
        }
        for (row = rowsUsed; row < MAX_ROWS; row++) {
            for (column = colsUsed; column < MAX_COLS; column++) {
                table[row][column] = '+';
            }
        }
        for (column = 0; column < colsUsed; column++) {
            for (row = 0; row < rowsUsed; row++) {
                table[row][column] = '_';
            }
        }
        printMatrix(table);
    }

    public static void printMatrix(char[][] A) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
        // System.out.println();
    }
}
