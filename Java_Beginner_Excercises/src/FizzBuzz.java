public class FizzBuzz {
    public static void main(String[] args) {


        int i = 1;
        while (i <= 100){
            if ( i % 3 == 0 ) {
                System.out.printf(" Fizz, ");
            }else if( i % 5 == 0 ) {
                System.out.printf(" Buzz, ");
            }else{
                System.out.printf("%d, ",i);
            }
            i++;
        }
    }
}
