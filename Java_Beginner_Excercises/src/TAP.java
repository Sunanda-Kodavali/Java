public class TAP {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 12){
            if ( i % 3 == 0 ) {
                System.out.printf("%d TAP! ",i);
            }else{
                System.out.printf("%d ",i);
            }
            i++;
        }
    }
}
