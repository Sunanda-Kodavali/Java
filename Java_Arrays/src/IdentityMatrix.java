import java.util.Scanner;

public class IdentityMatrix {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Please enter no.of rows in matrix");
        int rows = scanner.nextInt();
        System.out.println("Please enter no.of cols in matrix");
        int cols = scanner.nextInt();

        if(rows != cols){
            System.out.println("Matrix should be Square Matrix");
            System.exit(0);

        }

        int[][] matrix = readMatrices(new int[rows][cols], rows, cols);
        if(identityMatrix(matrix, rows, cols)){
            System.out.println("It's an Identity Matrix");
        }else{
            System.out.println("It's not an Identity Matrix");
        }

    }

    private static boolean identityMatrix(int[][] matrix, int rows, int cols) {
        // Arrays.deepEquals(readmatrix[] a1, identity[] a2)
        int counter = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(i == j && matrix[i][j] == 1){
                    counter++;
                }
                if(i != j && matrix[i][j] == 0){
                    counter++;
                }
            }
        }
        return counter == rows * cols;
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
