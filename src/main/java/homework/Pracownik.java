package homework;

public class Pracownik
{
    public String imie;
    public String nazwisko;
    public int wiek;

    public Pracownik()
    {
        this.imie = "Gall";
        this.nazwisko = "Anonim";
        this.wiek = 30;
    }

    public Pracownik(String imie, String nazwisko, int wiek)
    {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    public Pracownik(String imie)
    {
        this.imie = imie;
        this.nazwisko = imie;
        this.wiek = 30;
    }

    public Pracownik(int wiek)
    {
        this.imie = "Gall";
        this.nazwisko = "Anonim";
        this.wiek = wiek;
    }

    public void wyswietlDane() {
        System.out.println("imię=" + imie + " nazwisko=" +nazwisko+ " wiek=" + wiek);
    }
}
