package sdajava20190112.lenic.eu;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Imiona {

// imiona trzymay strukturze typu set

    public static void main(String...args)
    {
        Scanner rev = new Scanner(System.in);
        Set<String> imiona = new HashSet<String>();

        String imie = null;


        boolean in = true;

        do {
            System.out.print("Podaj imię (klucz):");
            imie = rev.next();

            System.out.print("Podaj imię (wartosc):");
            imie = rev.next();


            if(!imie.equals("-"))
                imiona.add(imie);
            else
                in = false;

        } while (in);

        System.out.println("Liczba unikalnych imion to " + imiona.size());
        //System.out.println("Liczba unikalnych imion to " + imiona);

        for(String unikalneImie: imiona){
            System.out.println(unikalneImie);
        }
    }
}
