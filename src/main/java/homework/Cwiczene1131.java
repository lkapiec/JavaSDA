package homework;

import java.util.Scanner;

public class Cwiczene1131 {

    public static int obliczSzerokosc(int poziom)
    {
        return (2 * poziom) - 1;
    }

    public static void narysujChoinka(int wysokosc)
    {
        int szerokoscMaksymalna = obliczSzerokosc(wysokosc);

        System.out.println("Wesołych!"); // konczy nową linią

        for(int poziom = 1; poziom <= wysokosc; poziom++)
        {
            int iloscGwiazdek = obliczSzerokosc(poziom);
            /* wzór po pewnych uproszczeniach */
            int iloscSpacji = wysokosc - poziom;

            for(int ileZnakow = 0; ileZnakow < (iloscSpacji + iloscGwiazdek); ileZnakow++)
            {
                if(ileZnakow < iloscSpacji)
                    System.out.print(' ');
                else
                    System.out.print('*');
            }
            System.out.println("");
        }
    }

    public static void main(String[] args)
    {
        Scanner rev = new Scanner(System.in);
        System.out.print("Podaj wysokość:");
        int n = rev.nextInt();
        narysujChoinka(n);
    }
}

/*
    public static void wypelnijWyswietl(int n)
    {
        int[] tablica = new int[n];

        for(int i = 0; i < tablica.length; i++)
        {
            tablica[i] = i+1;
        }

        int index = 0;
        do {
            System.out.println(tablica[index++]);
        } while(index < tablica.length);
    }
*/