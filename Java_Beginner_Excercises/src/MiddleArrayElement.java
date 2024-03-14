public class MiddleArrayElement {
    public static void main(String[] args) {
        int[] numbers = { 12, 4, 2, 10, 17 };
        int b = numbers.length/2;
        if(b==0){
            System.out.println(numbers[b+1]);
        }else{
            System.out.println(numbers[b]);
        }
        int[] temp = new int[numbers.length];
        int index =0;
        for(int i=numbers.length-1;i>=0;i--){
            System.out.print(numbers[i] + " ");
        }
    }
}
