package homework;


import com.sun.org.apache.xpath.internal.operations.Div;

import java.util.Scanner;

public class Sobota15122018_1037 {


    public static int excep() throws ArithmeticException, NullPointerException
    {
        if(true)
            throw  new NullPointerException("np-exception z metody") ;
        if(false)
            throw new ArithmeticException("z metody");

        return 0;
    }


    public static void main(String...agrs)
    {
        int tab[] = {5,4,3,2,1};

        Scanner odczyt = new Scanner(System.in);
        int index = -1;

        do {
        System.out.print("Podaj index tablicy: ");

            try {
                index = odczyt.nextInt();
            } catch (ArrayIndexOutOfBoundsException e)
            {
                //e.printStackTrace();
            }

            if(index == 4)
            throw new ArithmeticException("błędne dane");

            if(index == 3) {
                int zwrotka = excep();
            }

        try {
            System.out.println(tab[index]);
        } catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Niepoprawny parametr, rozmiar tablicy to: " + tab.length);
        } finally
            {
                System.out.println("Obsługa po wyjatkowa");
            }

        } while(index != 100);




    }


}
