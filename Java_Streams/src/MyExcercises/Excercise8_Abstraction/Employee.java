package MyExcercises.Excercise8_Abstraction;

public abstract class Employee {

    private String name;

    public Employee(String name) {
        this.name = name;
    }

    abstract double calculateSalary();

    void getDetails(){
        System.out.println(name);
    }
}
