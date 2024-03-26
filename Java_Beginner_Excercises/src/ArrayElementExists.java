import java.util.Arrays;

public class ArrayElementExists {
    public static void main(String[] args) {
        int n = 20;
        int[] numbers = {4, 7, 10, 12, 1, 8, 20};
        boolean res = false;
        for(int e : numbers){
            if (e == n) {
                res = true;
                break;
            }
        }
        System.out.println(res);
     //   System.out.println(Arrays.asList(numbers).contains(n));
    }

}
