public class ArrayElementExists {
    public static void main(String[] args) {
        int n = 20;
        int[] numbers = {4, 7, 10, 12, 1, 8, 20};
        boolean res = false;
        for(int e : numbers){
            if(e == n){
                res = true;
            }else{
                res = false;
            }
        }
        System.out.println(res);
    }
}
