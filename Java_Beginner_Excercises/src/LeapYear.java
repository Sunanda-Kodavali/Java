import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int InYear = sc.nextInt();
        boolean leapOrNot = isLeapYear(InYear);
        if(leapOrNot){
            System.out.println("Its a Leap Year");
        }else{
            System.out.println("Its not a Leap Year");
        }
    }
    public static boolean isLeapYear(int year){
        boolean leap = false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }
            else
                leap = true;
        }
        else
            leap = false;
        return leap;
    }
}
