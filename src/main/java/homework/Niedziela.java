package homework;

import java.util.Scanner;

public class Niedziela {

    public static void bombaFor()
    {
        Scanner rev = new Scanner(System.in);
        System.out.print("Podaj liczbę dodatnią:");
        int wartosc =  rev.nextInt();

        System.out.print("Bomba wybuchnie za ");
        for(int index = wartosc; index > 0; index--)
        {
            System.out.print(index + " ");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Hakuna matata!");
    }

    public static void bombaWhile()
    {

        Scanner rev = new Scanner(System.in);
        System.out.print("Podaj liczbę dodatnią:");
        int wartosc =  rev.nextInt();

        System.out.print("Bomba wybuchnie za ");
        int index = wartosc;
        while(index >= 0) /* na filmach pojawia sie 0 :) */
        {
            System.out.print(index + " ");
            index--;
        }
        System.out.println("Hakuna matata!");
    }






    public static void program()
    {
        Scanner rev = new Scanner(System.in);
        System.out.print("Podaj dzielnik(int):");
        int dzielink =  rev.nextInt();

        if(dzielink == 0)
        {
            System.out.print("Błędne dane!");
            return;
        }

        System.out.print("Podaj liczbe(int):");
        int liczba =  rev.nextInt();

        for(int index = liczba - 1; index > 0; index--)
        {
            if((index % dzielink) == 0)
                System.out.print(" " +index);
        }
    }


    public static void programDwa()
    {
        Scanner rev = new Scanner(System.in);
        System.out.print("Podaj m(do podniesc do potegi):");
        int m =  rev.nextInt();

        System.out.print("Podaj n:");
        int n =  rev.nextInt();

        for(int index = n; index >= 0; index--)
        {

            //System.out.print("m:" + index  + "\n");
            System.out.print("n:" + index + " " + m + "^" + index+ "="    + Math.pow(m,index) + "\n");
            //return Math.pow(a,2) + Math.pow(b,2) == Math.pow(c,2);
            //if((index % dzielink) == 0)
            //    System.out.print(" " +index);
        }
    }


    public static boolean checkParity(int value)
    {
        if(value == 0) return false;

        return (value % 2 == 0);
    }



    public static void programTrzy()
    {
        Scanner rev = new Scanner(System.in);
        System.out.print("Podaj licze dodatnią:");
        int liczba =  rev.nextInt();

        if(liczba < 0)
        {
            System.out.print("Błednie dane!");
            return;
        }

        for(int index = 1; index <= liczba; index++)
        {

            if((index % 2) != 0)
                System.out.print("" + index + " ");
        }
    }



    public static void programFor()
    {
        Scanner rev = new Scanner(System.in);
        System.out.print("Podaj A (początek ciągu):");
        int A =  rev.nextInt();

        System.out.print("Podaj B (koniec ciągu):");
        int B =  rev.nextInt();

        int suma = 0; // element neutrlany sumy

        if(A < B) {
            for(int index = A; index <= B; index++)
            {
                suma += index;
            }
            System.out.print("" + suma + " ");
        } else
        {
            System.out.print("Błednie dane!");
        }
    }

    public static void programDoWhile()
    {
        Scanner rev = new Scanner(System.in);
        System.out.print("Podaj A (początek ciągu):");
        int A =  rev.nextInt();

        System.out.print("Podaj B (koniec ciągu):");
        int B =  rev.nextInt();

        int suma = 0; // element neutrlany sumy

        if(A < B) {
            int index = A;
            do {
                suma += index;
                index++;
            } while(index <= B);
            System.out.print("" + suma + " ");
        } else
        {
            System.out.print("Błednie dane!");
        }
    }

    public static void programWhile()
    {
        Scanner rev = new Scanner(System.in);
        System.out.print("Podaj A (początek ciągu):");
        int A =  rev.nextInt();

        System.out.print("Podaj B (koniec ciągu):");
        int B =  rev.nextInt();

        int suma = 0; // element neutrlany sumy

        if(A < B) {
            int index = A;
            while(index <= B)
            {
                suma += index;
                index++;
            }
            System.out.print("" + suma + " ");
        } else
        {
            System.out.print("Błednie dane!");
        }
    }


    public static void programPiec()
    {
        Scanner rev = new Scanner(System.in);
        System.out.print("Podaj A (początek ciągu):");
        int A =  rev.nextInt();

        System.out.print("Podaj B (koniec ciągu):");
        int B =  rev.nextInt();

        int suma = A; // element neutrlany sumy
        int pomocnicza = B - A;
        System.out.print("pomocznicza:" + pomocnicza + " ");

        if(A < B) {
            for(int index = 0; index < (pomocnicza+1); index++)
            {
                System.out.print("index:" + index + "\n");
                suma += pomocnicza + index;
            }
            System.out.print("" + suma + " ");
        } else
        {
            System.out.print("Błednie dane!");
        }
    }


    public static void programPiec2()
    {
        Scanner rev = new Scanner(System.in);
        System.out.print("Podaj A (początek ciągu):");
        int A =  rev.nextInt();

        System.out.print("Podaj B (koniec ciągu):");
        int B =  rev.nextInt();

        int suma = A; // element neutrlany sumy
        int pomocnicza = B - A;
        System.out.print("pomocznicza:" + pomocnicza + " ");

        if(A < B) {
            for(int index = 0; index < (pomocnicza+1); index++)
            {
                System.out.print("index:" + index + "\n");
                suma += pomocnicza + index;
            }
            System.out.print("" + suma + " ");
        } else
        {
            System.out.print("Błednie dane!");
        }
    }


    public static void sumCalculate(int max)
    {
        int suma = 0; // element neutrlany sumy

        while(max > 0)
            suma += max--;

        System.out.println("Suma to:" + suma);
    }


    public static long sumFactorial(int max)
    {
        if(max > 13) return 0; /* poza zakresem */

        int fact = 1; // element neutrlany mozenia

        while(max > 0)
        {
            fact *= max--;
        }

        System.out.println("silnia to:" + fact);

        return fact;
    }


    static public void main(String[] args)
    {
        //bomba();
        //programPiec();
        //program();
        //programWhile();

        //sumCalculate(100);

        sumFactorial(12);

        //xxx();

        return;
    }


    /* 99 do potegi n) */
}
