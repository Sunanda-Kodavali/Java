public class FibonacciSequence {
    public static void main(String[] args) {
        int a = 1, b = 1;
        System.out.print(a+" "+b+" ");
        for (int i = 2; i < 20; i++) {
            int c = a + b;
            a = b;
            b = c;
            System.out.print(c+" ");
        }
    }
}
