public class ArrayFirstLastSum {
    public static void main(String[] args) {
        int[] numbers = { 2, 5, 10, 6, 3, 12, 20, 4, 15, 10 };
        int a = numbers[0];
        int b = numbers[numbers.length-1];
        System.out.println(a+b);
    }
}
