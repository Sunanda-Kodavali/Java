public class Grid {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                int k = i*j;
                if(String.valueOf(k).length()==1){
                    System.out.print("  "+k+" ");
                }else if(String.valueOf(k).length()==2){
                    System.out.print(" "+k+" ");
                }else{
                    System.out.print(k);
                }
            }
            System.out.println();
        }
    }
}
