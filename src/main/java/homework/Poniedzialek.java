package homework;

import java.util.Scanner;

public class Poniedzialek {

    Scanner rev;

    public static void wprowadz(int ilosc)
    {
        int[] tablica = new int[ilosc];

        int index = 0;

        do {
            tablica[index] =  index + 1;
            index++;
        } while(index < tablica.length);

        index = tablica.length;

        do {
            index --;
            System.out.println(tablica[index]);
        } while(index > 0);
    }


    public static void main(String[] args)
    {
        Scanner rev = new Scanner(System.in);

        System.out.print("Podaj n:");
        int n = rev.nextInt();

        if(n > 0) {
            wprowadz(n);
        } else
        {
            System.out.print("Nie zostały wprowadzone zadne dane");
        }
    }
}
