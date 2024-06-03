package MyExcercises.Excercise7_Polymorphism;

public class Circle implements Shape{

    private int r;

    public Circle(int r) {
        this.r = r;
    }

    @Override
    public double getArea() {
        return Math.PI * r * r;
    }
}
