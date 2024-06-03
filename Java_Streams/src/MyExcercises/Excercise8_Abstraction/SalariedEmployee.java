package MyExcercises.Excercise8_Abstraction;

public class SalariedEmployee extends Employee{

    private double annualSalary;

    public SalariedEmployee(String name, double annualSalary) {
        super(name);
        this.annualSalary = annualSalary;
    }

    @Override
    double calculateSalary() {
        return annualSalary;
    }
}
