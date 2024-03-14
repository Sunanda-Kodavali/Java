public class EvenNumbers {
    public static void main(String[] args) {

        int x=1;
        int n =100;
        for(int i=2;i<=100;i+=2){
            System.out.printf("%d ",i);
        }
        while (x<=n) {
            if(x%2==0) {
                System.out.printf("%d ",x);
            }
            x+=1;

        }
    }
}
