import java.util.Scanner;

public class SumOrProductN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :  \n");
        int N = sc.nextInt();
        System.out.println("Enter f for factorial, s for sum \n");
        String choice = sc.next();

        //These lines are ignored by C
        if (choice.equalsIgnoreCase("f"))
        {
            System.out.println(fact(N));
        }
        else if (choice.equalsIgnoreCase("s"))
        {
            System.out.println(sum(N));
        }else {
            System.out.println("Wrong Choice");
        }
    }

    static int sum(int num)
    {
        int sum =0;
        for (int i =1; i <=num; i++ )
            sum = sum+i;
        return sum;
    }

    static int fact (int num)
    {
        int fact =1;
        for (int i =1; i <=num; i++ )
            fact = fact*i;
        return fact;
    }

}
