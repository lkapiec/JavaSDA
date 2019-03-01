// nie wiem czy edukacyjny

package homework;

public class Firma {
    static Pracownik[] pracownicy = new Pracownik[3];

    public static void main(String...args)
    {
        Pracownik osobnik1 = new Pracownik("a", "b", 10);
        System.out.println("imię=" + osobnik1.imie + " nazwisko=" + osobnik1.nazwisko+ " wiek=" + osobnik1.wiek);

        Pracownik osobnik2 = new Pracownik("c");
        System.out.println("imię=" + osobnik2.imie + " nazwisko=" + osobnik2.nazwisko+ " wiek=" + osobnik2.wiek);

        Pracownik osobnik3 = new Pracownik();
        System.out.println("imię=" + osobnik3.imie + " nazwisko=" + osobnik3.nazwisko+ " wiek=" + osobnik3.wiek);

        Pracownik osobnik4 = new Pracownik(45);
        System.out.println("imię=" + osobnik4.imie + " nazwisko=" + osobnik4.nazwisko+ " wiek=" + osobnik4.wiek);
    }
}

