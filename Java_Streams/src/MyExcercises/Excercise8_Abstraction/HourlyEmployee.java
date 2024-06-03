package MyExcercises.Excercise8_Abstraction;

public class HourlyEmployee extends Employee{

    private double hourlyRate;
    private int hoursWorked;


    public HourlyEmployee(String name, double hourlyRate, int hoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}
