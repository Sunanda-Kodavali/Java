import java.util.Scanner;

public class TriangleHypotenuse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        double h = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        System.out.println("TriangleHypotenuse::::::"+h);


    }
}
