package homework;


//skonczone
import java.util.Scanner;

public class Cwiczenie1142 {

    public static void main(String[] args)
    {
        final int ilosc = 10;
        int min = 0, max = 0;
        int srednia = 0;
        int sredniaSuma = 0;
        int ileW = 0, ileM = 0;

        // tablica fake
        int tablica[] = new int[]{-3, 9, 2, -10, -3, -4, -1, -5, -10, 8};
        //int tablica[] = new int[ilosc];

        // losowanie
        for(int i = 0; i < tablica.length; i++)
        {
            tablica[i] = (int) (Math.random() * 20) - 10;
        }

        System.out.println("Wylosowane wartosci:");
        for(int i = 0; i < tablica.length; i++)
        {
            System.out.print(tablica[i] + " ");
        }

        //min max
        for(int i = 0; i < tablica.length; i++)
        {
            if(i == 0) {
                min = tablica[i];
                max = tablica[i];
            } else
            {
                if(min > tablica[i])
                    min = tablica[i];

                if(max < tablica[i])
                    max = tablica[i];
            }

            sredniaSuma += tablica[i];

            //System.out.println(tablica[i]);
        }

        srednia = (int) sredniaSuma / tablica.length;

        System.out.println("");
        System.out.println("Min: " + min + ", max: " + max);
        System.out.println("Średnia: " + srednia);

        // ile wiekszych i ile mniejszych
        for(int i = 0; i < tablica.length; i++)
        {
            if(tablica[i] > srednia)
                ileW++;

            if(tablica[i] < srednia)
                ileM++;
        }

        System.out.println("Mniejszych od śr.: " + ileM);
        System.out.println("Wiekszych od śr.:: " + ileW);

        System.out.println("Liczby w odwrotnej kolejniości:");
        for(int i = (tablica.length - 1); i >= 0; i--)
        {
            System.out.print(tablica[i] + " ");
        }
    }
}
