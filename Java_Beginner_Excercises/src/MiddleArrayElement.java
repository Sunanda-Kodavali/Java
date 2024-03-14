public class MiddleArrayElement {
    public static void main(String[] args) {
        int[] numbers = { 12, 4, 2, 10, 17, 23};
        int b = numbers.length;
        if(b%2==0){
            b=b/2;
            System.out.println(numbers[b-1]+numbers[b]);
        }else{
            b=b/2;
            System.out.println(numbers[b]);
        }

    }
}
