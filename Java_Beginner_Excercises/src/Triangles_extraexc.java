import java.util.Scanner;

public class Triangles_extraexc {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       // printTriangles(n);
      //  printTriangleNumbers(n);
         // printXmasTree(n);


    }

    private static void printXmasTree(int n) {
        for (int i = 1; i <=n ; i++) {
            for(int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            for (int st = 1; st <= i*2-1 ; st++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("    I      ");
    }

    private static void printTriangleNumbers(int n) {

        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++) System.out.print(i);
            System.out.println();
        }
    }

    private static void printTriangles(int n) {
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++) System.out.print("*");
            System.out.println();
        }
    }
}
