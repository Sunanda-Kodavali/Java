public class FibonacciArray {
    public static void main(String[] args) {

        int n = 10, a = 1, b = 1;
        int[] fibArray = new int[n];
        fibArray[0] = a;
        fibArray[1] = b;
        for (int i = 2; i < n; i++) {

            int c = a + b;
            a = b;
            b = c;
            fibArray[i] = c;
        }
        for (int j = 0; j <n ; j++) {
            System.out.printf("%d ",fibArray[j]);
        }

    }
}
