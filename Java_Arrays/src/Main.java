public class Main {
    public static void main(String[] args) {

        int[][] matrix = {
                { 6, 7, 5, 4 },
                { 6, 3, 9, 2 },
                { 2, 7, 8, 2 },
                { 1, 9, 0, 1 }
        };

        printFullMatrix(matrix);
    }

    public static int[] calculateSumRows(int[][] matrix) {

        int[] totals = new int[4];
        for (int i  = 0; i < 4; i++) {
            for (int j  = 0; j < 4; j++) {
                totals[i] += matrix[i][j];
            }
        }
        return totals;
    }

    public static int[] calculateSumCols(int[][] matrix) {
        int[] totals = new int[4];
        for (int i  = 0; i < 4; i++) {
            for (int j  = 0; j < 4; j++) {
                totals[j] += matrix[i][j];
            }
        }
        return totals;
    }

    public static void printFullMatrix(int[][] matrix) {
        int[] sumRows = calculateSumRows(matrix);
        int[] sumCols = calculateSumCols(matrix);

        for (int i  = 0; i < 4; i++) {
            for (int j  = 0; j < 4; j++) {
                if (j > 0) {
                    System.out.print(" + ");
                }
                System.out.print(matrix[i][j]);
            }
            System.out.println(" = " + sumRows[i]);
        }

        System.out.println("----------------");

        for (int i = 0; i < sumCols.length; i++) {
            System.out.print(sumCols[i] + "  ");
        }
    }
}