import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(b==0){
            System.out.println("Sorry! Cannot be divide by 0");
        }else{
            System.out.println("Result:::"+(a/b));
        }
    }
}
