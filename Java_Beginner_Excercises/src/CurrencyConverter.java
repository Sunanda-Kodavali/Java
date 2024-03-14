import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int dollars = sc.nextInt();
        double moneyEuros = dollars * 0.9143;
        System.out.printf("%.2f€",moneyEuros);
    }
}
