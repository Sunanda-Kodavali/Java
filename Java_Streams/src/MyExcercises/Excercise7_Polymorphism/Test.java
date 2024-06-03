package MyExcercises.Excercise7_Polymorphism;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List<Shape> list = new ArrayList<>();
        list.add(new Circle(5));
        list.add(new Circle(4));
        list.add(new Rectangle(2, 3));
        list.add(new Rectangle(3, 4));

        for (Shape s: list){
                System.out.println(s.getArea());
        }

    }
}
