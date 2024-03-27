public class Exercise4_Trees {
    public static void main(String[] args) throws InterruptedException {
        // TODO: ask user for input later...
        int size = 4;
        int numberOfTriangles = 3;

        for (int i = 0; i < numberOfTriangles; i++) {
            System.out.print(createNumberedTriangle(size));
        }

    }

    public static String createNumberedTriangle(int size) {
        String triangle = "";
        for (int i = 1; i <= size; i++) {
            triangle += createLine(i, i + "");
        }
        return triangle;
    }

    public static String createTriangle(int size, String symbol) {
        String triangle = "";
        for (int i = 0; i < size; i++) {
            triangle += createLine(i + 1, symbol);
        }
        return triangle;
    }

    public static void printTriangle(int size, String symbol) {
        System.out.println(createTriangle(size, symbol));
    }

    public static String createLine(int length, String symbol) {
        String line = "";
        for (int i = 0; i < length; i++) {
            line += symbol;
        }
        line += "\n";
        return line;
    }

    public static void printLine(int length, String symbol) {
        System.out.print(createLine(length, symbol));
    }
}
