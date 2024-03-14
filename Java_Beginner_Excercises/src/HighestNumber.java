import java.util.Scanner;

public class HighestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int max = num1;

        if(num2 > max){
           max = num2;
        }
        if(num3 >max){
            max = num3;
        }
        System.out.println(max);
    }
}
