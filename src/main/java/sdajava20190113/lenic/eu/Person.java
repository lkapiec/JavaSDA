package sdajava20190113.lenic.eu;

public class Person implements IPerson {

    private String imie;
    private String nazwisko;

    public Person(String imie, String nazwisko)
    {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    private String getImie() {
        return this.imie;
    }
    private  String getNazwisko() {
        return this.nazwisko;
    }

    public String FirstName() { return getImie(); }
    public String LastName() {
        return getNazwisko();
    }
}
