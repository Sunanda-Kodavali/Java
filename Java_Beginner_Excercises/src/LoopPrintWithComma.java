public class LoopPrintWithComma {
    public static void main(String[] args) {
        int x = 1;
        while (x <= 5) {
                System.out.print(x + ((x == 5) ? "\n" : ", "));
                x += 1;
        }
    }
}
