package sdajava20190112_2.lenic.eu;

public class Employer extends Person  {

    private String companyName;

    public Employer(String imie, String nazwisko, String companyName) {
        super(imie, nazwisko);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return this.companyName;
    }

    public String toString()
    {
        return "First Name:" + this.getNazwisko()+ "\n" +
                "Last Name:" + this.getNazwisko() + "\n" +
                "Company" + this.getCompanyName() + "\n";
    }
}
