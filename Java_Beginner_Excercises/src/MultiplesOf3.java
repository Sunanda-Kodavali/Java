public class MultiplesOf3 {
    public static void main(String[] args) {
        int x = 1,a = 3;
        while (x<=30) {
            if(x!=30 && x%3==0) {
                System.out.printf("%d, ", x);
            }else {
                if(x%3==0) {
                    System.out.printf("%d", x);
                }
            }
            x+=1;
        }
    }
}
