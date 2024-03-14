import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        boolean b = isLeapYear(a);
        if(b){
            System.out.println("Its a Leap Year");
        }else{
            System.out.println("Its not a Leap Year");
        }
    }
    public static boolean isLeapYear(int a){
        boolean x = false;
        if(a % 4 == 0){
            if(((a % 100) != 0) || ((a % 400) == 0)){
                x = true;
                System.out.println((a % 400));
                System.out.println((a % 100));
            }
        }
        return x;
    }
}
