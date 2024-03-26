import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayExc {
    public static void main(String[] args) {
        int n = 6;
        int[] num = {5, 6, 11, 6, 3};

        int index1 = arrayIndex(n, num);
        System.out.println("index::::" + index1);

        int[] arrIndex = arrayMultipleIndex(n, num);
        System.out.println("indexes::::" + Arrays.toString(arrIndex));

    }

    private static int[] arrayMultipleIndex(int n, int[] num) {

       /* int counter = 0;

        for (int i = 0; i < num.length; i++) {
            if (num[i] == n) {
                counter += 1;
            }
        }

        int[] matchIndexes = new int[counter];
        if(counter == 0){
            return matchIndexes;
        }
        int index = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] == n) {
                matchIndexes[index] = i;
                index += 1;
            }
        }

        return matchIndexes;*/

        int[] matchIndexes = new int[num.length];
        int index = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] == n) {
                matchIndexes[index] = i;
                index += 1;
            }
        }

        return Arrays.copyOf(matchIndexes,index);
    }

    private static int arrayIndex(int n, int[] num) {
        for (int i = 0; i < num.length; i++) {
            if (num[i] == n) {
                return i;
            }
        }
        return -1;
    }


}
