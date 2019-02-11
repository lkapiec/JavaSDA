package homework;

// testy

import static Nie08122018.Zamowienie.zapiszZamowienie;
import static Nie08122018.Zamowienie.wczytajZamowienie;

public class TestujZamownienie {

    public static void main(String...arg)
    {

        Zamowienie zam = new Zamowienie(5);
        Pozycja poz = new Pozycja("Cukier", 10, 10);
        zam.monitor();

        zam.dodajPozycje(poz);
        //zapiszZamowienie(zam, "plik");


        //Zamowienie zam = wczytajZamowienie("plik");
        //System.out.print(zam.toString());


        poz = new Pozycja("Cukier", 10, 10);
        //System.out.print(poz.toString());
        //zam.dodajPozycje(poz);



        //System.out.print(poz.toString());
        //zam.dodajPozycje(poz);
        //System.out.print("\n");

        poz = new Pozycja("Mąka", 20, 1.1);
        //System.out.print(poz.toString());
        zam.dodajPozycje(poz);
        //System.out.print("\n");

        poz = new Pozycja("Mąka", 2, 1.1);
        //System.out.print(poz.toString());
        zam.dodajPozycje(poz);
        //System.out.print("\n");
        poz = new Pozycja("Cukierki", 10, 33.1);
        //System.out.print(poz.toString());
        zam.dodajPozycje(poz);
        //System.out.print("\n");
        //System.out.print("\n\n");
        //

        //System.out.print(zam.toString());

        //zam.edytujPozyja(1);
        //System.out.print(zam.toString());

        System.out.println("usuwam zamowniene o indeksie 0");

        zam.usunPozyja(0);

        System.out.println("usuwam zamowniene o indeksie 2");

        zam.usunPozyja(2);



        poz = new Pozycja("Fistaszki", 55, 0.1);
        zam.dodajPozycje(poz);

        poz = new Pozycja("Lody", 55, 0.1);
        zam.dodajPozycje(poz);

        poz = new Pozycja("Mleko", 55, 0.1);
        zam.dodajPozycje(poz);

        System.out.print(zam.toString());


        System.out.println("==usuwam==");

        zam.usunPozyja(0);
        zam.usunPozyja(2);
        zam.usunPozyja(3);

        System.out.print(zam.toString());

        /*System.out.println("==dodaje==");

        poz = new Pozycja("Proszek do prania", 1, 80.8);
        zam.dodajPozycje(poz);

        System.out.print(zam.toString());


        System.out.println("==usuwam po nazwie==");

        zam.usunPozyja("xxxx");

        System.out.print(zam.toString());


        zam.usunPozyja("Lody");

        System.out.print(zam.toString());*/
    }
}
