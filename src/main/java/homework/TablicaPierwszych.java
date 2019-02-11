package homework;

import java.util.Scanner;

public class TablicaPierwszych {

    /*9. Napisz program, który pobiera od użytkownika dodatnią liczbę naturalną n i
    tworzy tablicę a zmiennych typu logicznego (boolean) o rozmiarze n×n. Następnie
    program powinien wypełnić utworzoną tablicę, tak by a[i][j] = true jeżeli liczby
            (i+1) oraz (j +1) są względnie pierwsze, tzn. nie mają wspólnych dzielników poza
1. Tak utworzoną tablicę należy wypisać na ekranie, przy czym dla wartości true
    należy wyświetlić znak ”+”, natomiast dla wartości false znak ”.”.*/

    /* na samym początku robimy pewnie załozenie ze tablice bedziemy numerować od 1 a nie od zera (do 10 - włacznie)*/
    /* graficzny obszar bedziemy liczyc od zera, w tych kolumnach zerowych bedziemy bedziemy wysować współrzędne */

    static boolean[][] tab;

    public static boolean chkCoprimeIntegers(int i, int j)
    {
        boolean isPrime = true;
        return isPrime;
    }

    public static void setValue(int y, int x, boolean contition)
    {
        tab[y-1][x-1] = contition;
    }

    public static boolean getValue(int y, int x)
    {
        return tab[y-1][x-1];
    }

    public static void initTable(int n)
    {
        tab = new boolean[n][n]; // y&x

        for(int y = 0; y < tab.length; y++)
        {
            for(int x = 0; x < tab[y].length; x++)
            {
                tab[y][x] = false;

            }
        }

        //setValue(1,1,true);
        //setValue(1,2, true);
    }

    public static void generateCoprimeIntegersTable()
    {
        for(int y = 0; y < tab.length; y++)
        {
            for(int x = 0; x < tab[y].length; x++)
            {
              tab[y][x] = chkCoprimeIntegers(y+1,x+1);
            }
        }
    }

    public static void printTable()
    {
        System.out.println("");
        for(int y = 0; y <= 10; y++)
        {
            if(y == 0) {
            } else {
                if(y < 10) {
                    System.out.print(" " + y);
                } else
                {
                    System.out.print(y);
                }
                System.out.print("  ");
            }

            for(int x = 0; x <= 10; x++)
            {
                if(y == 0) {
                    if(x == 0)
                    {
                        System.out.print(" "+ " ");
                    } else if(x < 10) {
                        System.out.print(" " + x);
                    } else {
                        System.out.print(x);
                    }
                    System.out.print(" ");
                }

                if((x > 0)&&(y > 0))
                {
                    System.out.print((getValue(y,x)? "+" : ".") + "  ");
                }
            }
            System.out.println("");
        }
    }

    public static void main(String[] args)
    {
        Scanner rev = new Scanner(System.in);
        System.out.print("Podaj liczbę (> 10): ");

        int n = 10; //= rev.nextInt();

        if(n>9) {
            initTable(n);
            generateCoprimeIntegersTable();
            printTable();
        } else {
            System.out.print("Błędne dane");
        }
    }
}
