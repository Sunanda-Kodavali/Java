import java.time.LocalDate;
import java.time.Period;

public class Student {
    //instance var
    //property
    //attribute
    //member

    private String name;
    private LocalDate birthDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
    public int age(){
        return Period.between(birthDate,LocalDate.now()).getYears();
    }
}
