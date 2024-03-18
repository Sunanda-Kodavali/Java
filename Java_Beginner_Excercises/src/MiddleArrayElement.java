public class MiddleArrayElement {
    public static void main(String[] args) {
        int[] numbers = { 12, 4, 2, 10, 17, 23};
        int b = numbers.length / 2;
        if(numbers.length%2==0) System.out.println(numbers[b-1]+numbers[b]);
        else System.out.println(numbers[b]);
    }
}
