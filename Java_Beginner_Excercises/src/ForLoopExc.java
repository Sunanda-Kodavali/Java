public class ForLoopExc {
    public static void main(String[] args) {
        for (int i = 1; i <= 50 ; i++) {
            if(i % 3 == 0 && i % 5 == 0) System.out.println(i+ "!!! ");
            else if(i%3 == 0) System.out.println(i+ "! ");
            else if(i%5 == 0) System.out.println(i+ "!! ");
            else System.out.println(i);
        }

        for (int i = 1; i <= 50 ; i++) {
            System.out.print(i);
            if(i%3 == 0) System.out.print("!");
            if(i%5 == 0) System.out.print("!!");
            System.out.println();
        }
    }
}
