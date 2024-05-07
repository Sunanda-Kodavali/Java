import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        double sum = 0;
        List<Shape> shapes = new ArrayList<>();

        shapes.add(new Rectangle(2, 4));
        shapes.add(new Square(3));
        shapes.add(new Square(4));
        shapes.add(new Rectangle(2, 6));
        shapes.add(new Circle(4));
        shapes.add(new Circle(4));
        shapes.add(new Circle(4));

        sum = sumOfAllAreas(shapes, sum);
        
        System.out.println("Total  :" +Math.round(sum));


    }

    private static double sumOfAllAreas(List<Shape> shapes, double sum) {
        for (Shape shape : shapes){

                sum += shape.getArea();
            }

        return sum;
    }

}