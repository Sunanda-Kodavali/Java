import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= N; i++) {

            String s;
            if((i%3==0 || i%5==0)){
                System.out.printf("%d + ",i);
                sum += i;

            }
            if(i==N) {
                System.out.printf("%d = %d", i, sum);
            }

        }

    }
}
