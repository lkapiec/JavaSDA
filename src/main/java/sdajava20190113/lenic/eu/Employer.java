package sdajava20190113.lenic.eu;

public class Employer extends Person {

    private String companyName;

    public Employer(String imie, String nazwisko, String companyName) {
        super(imie, nazwisko);
        this.companyName = companyName;
    }

    public String getCompanyName()
    {
        return companyName;
    }
}
