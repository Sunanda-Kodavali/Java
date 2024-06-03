package MyExcercises.Excercise8_Abstraction;

public class Test {
    public static void main(String[] args) {

        HourlyEmployee h = new HourlyEmployee("Sun", 10, 8);
        h.getDetails();
        System.out.println(h.calculateSalary());

        SalariedEmployee s = new SalariedEmployee("Moon", 10000);
        s.getDetails();
        System.out.println(s.calculateSalary());
    }
}
