package sdajava20190113.lenic.eu;

public class Employee extends Person implements IEmployee {

    private String firstName;
    private String lastName;
    private int salary;
    Employer pracodawca;

    public Employee(String imie, String nazwisko,  int salary, Employer pracodawca) {
        super(imie, nazwisko);
        this.salary = salary;
        this.pracodawca = pracodawca;
    }

    @Override
    public Employer getEmployer() {
        return this.pracodawca;
    }

    @Override
    public double calcSalary() {
        return this.salary;
    }
}
