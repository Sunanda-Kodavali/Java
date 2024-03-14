import java.util.Scanner;

public class ATMMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int moneyInAccount = 1000;
        System.out.println("how much money he would like to withdraw?");
        int money = sc.nextInt();
        if(money>moneyInAccount){
            System.out.println("You don't have enough funds");
        }else {
            System.out.println("Have fun");
        }

    }
}
