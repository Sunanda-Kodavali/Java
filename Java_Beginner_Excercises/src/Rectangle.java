public class Rectangle {
    public static void main(String[] args) {
        int areaOfRectangle = areaOfRectangle(20,10);
        System.out.println("Area of Rectangle: "+areaOfRectangle);
        int perimeterOfRectangle = perimeterOfRectangle(20,10);
        System.out.println("Peremeter of Rectangle: "+perimeterOfRectangle);
        int areaOfSquare = areaOfSquare(10);
        System.out.println("Area of Square: "+areaOfSquare);
        int perimeterOfSquare = perimeterOfSquare(10);
        System.out.println("Peremeter of Square: "+perimeterOfSquare);
        double areaOfCircle = areaOfCircle(10);
        System.out.println("Area of Circle: "+areaOfCircle);
        double circumferenceOfCircle = circumferenceOfCircle(10);
        System.out.println("Circumference of Circle: "+circumferenceOfCircle);

    }

    private static double circumferenceOfCircle(int r) {
        return 2*Math.PI*r;
    }

    private static double areaOfCircle(int r) {
        return Math.PI*Math.pow(r,2);
    }

    private static int perimeterOfSquare(int a) {
        return 4 * a;
    }

    private static int areaOfSquare(int a) {
        return a * a;
    }

    private static int perimeterOfRectangle(int l, int w) {
        return (l + w) * 2;
    }

    private static int areaOfRectangle(int l, int w) {
        return l * w;
    }
}
