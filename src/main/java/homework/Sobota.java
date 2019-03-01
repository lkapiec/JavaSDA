package homework;

import java.util.Scanner;

public class Sobota {

    public static void bombaDoWhile(int wartosc)
    {
        System.out.print("Bomba wybuchnie za ");

        do {
                System.out.print(wartosc + " ");
        }
        while((--wartosc) >= 0);

        System.out.println("Hakuna matata!");
    }

    public static void Hello()
    {
        Scanner rev = new Scanner(System.in);

        do {
            System.out.print("Ile razy napisac? (zero - konczy program):");
            int ileRazy =  rev.nextInt();

            if(ileRazy == 0) break;

            do {
                System.out.println("Hello World");
            } while((--ileRazy) > 0);

        } while(true);
    }


    public static void sdaSqr()
    {
        Scanner rev = new Scanner(System.in);

        do {
            System.out.print("podaj wartosc do pierwisatka (zero - konczy program):");
            int liczba =  rev.nextInt();

            if(liczba <= 0) break;

            System.out.println("Pierwiastek z " +  liczba +  " rowny jest " + Math.sqrt(liczba));

        } while(true);
    }

    public static void displayPowLessThan(int max)
    {
        int pow;
        int index = 0;

        do {
            pow = (int) Math.pow(2, index++);
            if(pow > max) break;
            System.out.println(pow);
        } while(true);
    }


    public static void doComplexCalculation()
    {
        Scanner rev = new Scanner(System.in);

        int suma = 0;
        int ilosc = 0;
        int max = 0; /* proforma */
        int min = 0; /* proforma */

        do {
            System.out.print("podaj wartosc do sumy (0 - konczy program):");
            int liczba =  rev.nextInt();

            if(liczba == 0) break;

            /* wczytujemy pierwsza wartosci, to jest nasz punkt refenencyjny dla min i max*/
            if(ilosc == 0) {
                max = liczba;
                min = liczba;
            }

            if(liczba > max)
                max = liczba;

            if(liczba < min)
                min = liczba;

            suma += liczba;

            ilosc++;

        } while(true);

        if(ilosc > 0) {
            int sumaptp = max + min;
            System.out.println("Suma peaktopeak " + sumaptp);
            System.out.println("Srednia peaktopeak " + ((double)sumaptp/2));
            System.out.println("Srednia wszytkich " + (double) suma / ilosc);
        } else
        {
            System.out.print("Przedwczesnie opuszczony program");
        }
    }

    public static void robGra()
    {
        int liczba;
        Scanner rev = new Scanner(System.in);
        /* komputer losuje */
        int wartoscKomputera = (int) (Math.random() * 99) + 1;

        do {
            System.out.print("zgadnij wartosc wylosowana przez komputer:");
            liczba =  rev.nextInt();

            if(liczba > wartoscKomputera)
                System.out.println("Podałeś za duża wartość");

            if(liczba < wartoscKomputera)
            System.out.println("Podałeś za małą wartowść");

        } while(liczba != wartoscKomputera);

        System.out.println("Gratulacje");
    }


    public static void robProstokat(int x, int y, int a, int b, char zn)
    {
        for(int i = 1; i < y + a; i++) {
            //System.out.print(">");
            //System.out.print(" ");

            for(int j = 1; j < x + b; j++)
            {
                if(i >= y) {
                    if(j >= x) {
                        System.out.print(zn);
                    } else
                    {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println("");
        }
    }

    public static void main(String[] arg)
    {
        robProstokat(6,3,4, 6,'X');
    }
}
