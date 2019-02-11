package homework;

// wiek odejscia na emerutyre M 65 K 60

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.lang.*;

public class Cwiczenie1531 {

    public static void emerytura(String nazwaPliku, String plikKobiety, String plikMezczyzni) throws FileNotFoundException {

        final int IMIE = 0;
        final int NAZWISKO = 1;
        final int PLEC = 2;
        final int WIEK = 3;

        String linia;
        String[] podzielona;

        Integer integerValue = new Integer(30);

        File wczytajE = new File(nazwaPliku);
        Scanner wejscie = new Scanner(wczytajE);

        PrintWriter zapiszK = new PrintWriter(plikKobiety);
        PrintWriter zapiszM = new PrintWriter(plikMezczyzni);
        PrintWriter zapis = zapiszK;

        while (wejscie.hasNextLine()) {
            /* odczytujemy jedna linie z pliku */
            linia = wejscie.nextLine();
            /* zamieniamy zmienną tekstową w tablice zmiennych tekstowych */
            podzielona = linia.split(" ");

            /* Odczytujemy pierwszy znak zmiennej tekstowej */
            char plec = podzielona[PLEC].charAt(0);
            int wiek = integerValue.valueOf(podzielona[WIEK]);

            int doEmerytury = 0;

            switch(plec)
            {
                case 'M':
                {
                    doEmerytury = 65 - wiek;
                    zapis = zapiszM;
                    break;
                }
                case 'K':
                {
                    doEmerytury = 60 - wiek;
                    zapis = zapiszK;
                    break;
                }
                default:
                {
                    /* trzecia płeć 'G' :) */
                }
            }

            /* zapisujemy do odpowiedniego pliku */
            zapis.println(podzielona[IMIE] + " " + podzielona[NAZWISKO] + " " + doEmerytury);
        }
        zapiszK.close();
        zapiszM.close();
    }

    public static void main(String[] args)
    {
        /* uwaga, zmodyfikuj sciezki */
        final  String listaE = "src/Nie08122018/lista.txt";
        final  String listaK = "src/Nie08122018/kobiety.txt";
        final  String listaM = "src/Nie08122018/mezczyzni.txt";

        /* przechwytywanie wyjątków bedzie jeszcze omowione puzniej */
        try {
            emerytura(listaE, listaK,listaM);
        } catch (FileNotFoundException e)
        {
            System.out.println("Choroba ... brak pliku!");
        } catch (Exception e)
        {
            System.out.println("Choroba ..., jakis powazniejszy wyjątek!");
        }
    }
}
