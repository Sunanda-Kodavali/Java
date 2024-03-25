import java.util.Scanner;

public class Pallindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String res = "";

        for (int i = str.length()-1; i >=0 ; i--) {
            res+= str.charAt(i);
        }

        if(str.equalsIgnoreCase(res)){
            System.out.println("It's a Pallindrome");
        }else{
                System.out.println("It's not a Pallindrome");
        }


    }
}

