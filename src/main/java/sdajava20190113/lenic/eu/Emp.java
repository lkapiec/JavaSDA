package sdajava20190113.lenic.eu;

public class Emp  extends Person  {


    private int salary;
    private int wiek;

    public Emp(String imie, String nazwisko, int wiek, int salary) {
        super(imie, nazwisko);
        this.salary = salary;
        this.wiek = wiek;
    }

    public int getAge() {
        return this.wiek;
    }

    public int getSalary() {
        return this.salary;
    }

    public String toString() {
        return "" + super.FirstName() + " " + this.LastName();
    }
}
