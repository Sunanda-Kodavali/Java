import java.util.Scanner;

public class TwoMatricesAddition {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {


        System.out.println("Please enter no.of rows in matrix");
        int rows = scanner.nextInt();
        System.out.println("Please enter no.of cols in matrix");
        int cols = scanner.nextInt();

        int[][] firstMatrix = readMatrices(new int[rows][cols], rows, cols);
        int[][] secondMatrix = readMatrices(new int[rows][cols], rows, cols);
        int[][] sumMatrix = addMatrices(firstMatrix, secondMatrix, rows, cols);

        printMatrix(sumMatrix, rows, cols);

    }

    private static void printMatrix(int[][] sumMatrix, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(sumMatrix[i][j]+ " ");
            }
            System.out.println();
        }
    }

    private static int[][] addMatrices(int[][] firstMatrix, int[][] secondMatrix, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                firstMatrix[i][j] =  firstMatrix[i][j] + secondMatrix[i][j];
            }
        }
        return firstMatrix;
    }

    private static int[][] readMatrices(int[][] matrix, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("Enter Matrix[%d][%d] integer%n", i, j);
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }
}
