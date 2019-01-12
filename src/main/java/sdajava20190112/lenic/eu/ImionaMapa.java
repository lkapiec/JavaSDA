package sdajava20190112.lenic.eu;

import java.util.*;

public class ImionaMapa {

    public static void main(String...args)
    {
        Scanner rev = new Scanner(System.in);
        Map<String,String> imiona = new HashMap<String,String>();

        String klucz, wartosc = null;

        boolean in = true;

        do {
            System.out.print("Podaj imię (klucz):");
            klucz = rev.next();

            if(!klucz.equals("-")) {
                System.out.print("Podaj imię (wartosc):");
                wartosc = rev.next();

                imiona.put(klucz,wartosc);
            } else
                in = false;
        } while (in);

//        System.out.println("Liczba unikalnych imion to " + imiona.size());

       // System.out.println(imiona);

        System.out.print("Odszukaj:");
        String imie = rev.next();

        if(imiona.containsKey(imie))
        {
            System.out.println(imiona.get(imie));
        } else if(imiona.containsValue(imie))
        {
            //System.out.println(imiona.get(imie));
        }



    }

}
