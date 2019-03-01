package homework;

import java.util.Scanner;

/*
Napisać program, który utworzy tablicę 20 liczb całkowitych z przedziału 1 . . . 10,
a następnie wypisze na ekranie ile razy każda z liczb z tego przedziału powtarza
się w tablicy.
 */

public class Cwiczenie1306 {

    public static void main(String[] args)
    {
        final int ilosc = 20;
        final int zakres_min = 1;
        final int zakres_max = 10;

        int tablica[] = new int[ilosc];
        int powtorzenie[] = new int[zakres_max - zakres_min + 1];

        // losowanie
        for(int i = 0; i < tablica.length; i++)
        {
            tablica[i] = (int) (Math.random() * zakres_max) + zakres_min;
            System.out.print(tablica[i] + " ");
        }

        System.out.println();

        // czysimy tablice powtorzen
        for(int i = 0; i < powtorzenie.length; i++)
        {
            powtorzenie[i] = 0;
        }

        // obliczenie powtorzenia
        // przegladamy tablice liczb losowych od poczatku do konca
        for(int i = 0; i < tablica.length; i++)
        {
            //wyciagamy wartosc po koleji kazda wartosc
            int z = tablica[i];

            // zwiekszamy licznik dla danej liczby, ale pamietamy przy tym ze tablice liczymy od 0 a nie od 1
            powtorzenie[z-1] += 1;
        }

        // Wyswietamy wyniki
        for(int i = 0; i < powtorzenie.length; i++)
        {
            // w tablicy w pozycji [0] przechowujemy ile wyszło jedynek
            System.out.println((i + 1) + " - " + powtorzenie[i]);
        }
    }
}
