import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {

        int counter = 0;
        for (int i = 1; true; i++) {
            int sum = 0;
            for (int j = 1; j < i ; j++) {
                if(i%j == 0){
                    sum+=j;
                }

            }
            if(sum == i){
                counter++;
                System.out.print(i+" ");
            }
            if(counter==5) break;
        }

    }
}
