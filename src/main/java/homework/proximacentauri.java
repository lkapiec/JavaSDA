/* Napisać program obliczający średnią arytmetyczną z wszystkich podanych liczb ujemnych oraz iloczyn liczb dodatnich.
Liczby wczytywane są od użytkownika, koniec wczytywania oznacza podanie liczby 0.  */

/* wersja rekurencyjna (bez petli), funkcja wywoluje samą siebie */

package homework;

import java.util.Scanner;

public class proximacentauri {

    static double iloczyn = 1; /* element neutralny mnozenia to 1 oraz element startowy */
    static double sumasredniej = 0;
    static int iloscDoIloczynu = 0;
    static int iloscDoSredniej = 0;
    static Scanner rev;

    public static double wczytaj_od_uzytkownika()
    {
        if((iloscDoIloczynu == 0) && (iloscDoSredniej == 0))
            System.out.print("Podaj wartosc: ");
        else
            System.out.print("Podaj kolejną wartosc: ");

        return rev.nextDouble();
    }

    public static boolean gamma()
    {
        double wartosc = wczytaj_od_uzytkownika();

        if(wartosc == 0.0) return false;

        if(wartosc > 0.0) {
            iloczyn *= wartosc;
            iloscDoIloczynu++;
        } else {
            sumasredniej += wartosc;
            iloscDoSredniej++;
        }

        return gamma();
    }

    public static void main(String[] args)
    {
        rev = new Scanner(System.in);
        System.out.println("Program obliczający średnią arytmetyczną z wszystkich podanych liczb ujemnych oraz iloczyn liczb dodatnich.\n" +
                "Koniec wczytywania oznacza podanie liczby 0.");

        boolean wynik = gamma();

        if((iloscDoIloczynu == 0) && (iloscDoSredniej == 0))
            System.out.println("Uzytkownik nic nie podał");

        if(iloscDoIloczynu != 0)
           System.out.println("Iloczyn wartosoci to " + iloczyn);

        if(iloscDoSredniej != 0) /* aby przypadkiem nie dzielic przez zero */
            System.out.println("Srednia to " + (sumasredniej / iloscDoSredniej));
    }
}
