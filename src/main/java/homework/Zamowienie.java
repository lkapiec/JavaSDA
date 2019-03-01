package homework;

import com.sun.istack.internal.localization.NullLocalizable;

import java.util.Scanner;
import java.io.*;

public class Zamowienie implements Serializable {

    Pozycja[] pozycje;
    int ileDanych;
    int maksRozmiar;
    transient int liczbaOperacji;

    public Zamowienie(int maksRozmiar)
    {
        this.maksRozmiar = maksRozmiar;
        this.ileDanych = 0;
        this.liczbaOperacji = 0;
        pozycje = new Pozycja[this.maksRozmiar];
    }

    public Zamowienie()
    {
        this(10);
    }

    public int iloscPozycji()
    {
        return ileDanych;
    }
    public int iloscOperacji()
    {
        return this.liczbaOperacji;
    }

    public void monitor()
    {
        System.out.print("\n=============\n");
        System.out.print("Op " + this.iloscOperacji()+" zajetych " + this.ileDanych + " z " + this.maksRozmiar + "\n");
        for(int index = 0; index < pozycje.length; index++) {
            //System.out.println("index=" + index +  " towar" /*+ pozycje[index].nazwaTowaru*/);
            if(pozycje[index] == null) {
                System.out.print(".");

            } else
            {
                System.out.print("*");
            }
        }
        System.out.println("\n=============\n");
    }


    public int szukajPustaPozycja()
    {
        int pozycja = -1;

        for(int index = 0; index < pozycje.length; index++) {
            //System.out.println("index=" + index +  " towar" /*+ pozycje[index].nazwaTowaru*/);
            if(pozycje[index] == null) {
                //System.out.println("Znalazlem dziure na pozycji=" + index);
                    return index;
            }
        }
        return pozycja;
    }

    public int szukajPozycje(String nazwaTowaru)
    {
        int pozycja = -1;

        for(int index = 0; index < pozycje.length; index++)
        {
            //System.out.println("index=" + index +  " towar" /*+ pozycje[index].nazwaTowaru*/);
            if(pozycje[index] != null) {

                if ((pozycje[index].nazwaTowaru).equals(nazwaTowaru)) {
                    return index;
                }
            }
        }
        return pozycja;
    }

    public int szukaj(String nazwaTowaru)
    {
        int pozycja = -1;

        for(int index = 0; index < pozycje.length; index++)
        {
            //System.out.println("index=" + index +  " towar" /*+ pozycje[index].nazwaTowaru*/);
            if(pozycje[index] != null) {
                if ((pozycje[index].nazwaTowaru).equals(nazwaTowaru)) {
                    return index;
                }
            } else
            {
                if(nazwaTowaru == null)
                {
                    return index;
                }
            }
        }
        return pozycja;
    }

    /* do popdawy bo mozna wsadzic rekord w dziure */
    public void dodajPozycje(Pozycja p)
    {
        // sprawdz czy taki towar juz istnieje
        //int poz = szukajPozycje(p.nazwaTowaru);
        int poz = szukaj(p.nazwaTowaru);

        if(poz == -1)
        {
            // nie znaleziono towaru
            if(ileDanych >= maksRozmiar)
            {
                // nie mamy miejsca na nowe pozycje
                throw new IllegalStateException("Przekroczono liczbę mozliwych pozycji, produkt: " + p.nazwaTowaru + " nie zostanie dodany do zamowienia");
            } else {
                //int pusta = szukajPustaPozycja();
                int pusta = szukaj(null);

                if (pusta != -1) {
                    // znalezlismy luke aby tam cos dodac
                    System.out.println("Znalazlem dziure na pozycji=" + pusta);
                    this.pozycje[pusta] = p;
                    this.ileDanych++;
                    this.liczbaOperacji++;
                } else {
                    // ten błąd chyba mogł by teoretycznie wystapicjak bysmy nie inkremrntoali liczniak elemeotw
                    throw new IllegalStateException("Nie znalazlem wolnego miejsca, produkt: '" + p.nazwaTowaru + "' nie zostanie dodany do zamowienia (powazny błąd aplikacji)");
                }
            }
        } else
        {
            this.liczbaOperacji++;
            System.out.print(" (duplikat)");
            pozycje[poz].ileSztuk += p.ileSztuk;
        }
        monitor();
    }

    public void usunPozyja(int index)
    {
        this.pozycje[index] = null;
        this.ileDanych--;
        this.liczbaOperacji++;
        monitor();
    }

    public void usunPozyja(String nazwaTowaru)
    {
        int poz = szukajPozycje(nazwaTowaru);

        if(poz != -1) {
            System.out.println(nazwaTowaru + " usunieto");
            usunPozyja(poz);
        } else
        {
            System.out.println("Towar o nazwie: " + nazwaTowaru + " nie istnieje");
        }
    }

    public void edytujPozyja(int index)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Pozycja podlegająca edycji (%d)\n", index);
        System.out.printf("Podaj nazwe towaru: ");
        String nazwa = scanner.nextLine();
        System.out.printf("Podaj cene towaru: ");
        float cena = scanner.nextFloat();
        System.out.printf("Podaj ilosc towaru: ");
        int ilosc = scanner.nextInt();
        //(String nazwaTowaru, int ileSztuk, double cena)
        pozycje[index] = new Pozycja(nazwa, ilosc, cena);
        /* Scaner */
        monitor();
    }

    public double obliczWartosc(boolean rabat)
    {
        double wartosc  = 0;

        for(int index = 0; index < pozycje.length; index++)
        {
            if(pozycje[index] != null) {
                //System.out.println("index=" + index +  " towar" /*+ pozycje[index].nazwaTowaru*/);
                wartosc += rabat ? pozycje[index].obliczWartoscZRabatem() : pozycje[index].obliczWartosc();

                //if(rabat)
                //    wartosc += pozycje[index].obliczWartoscZRabatem();
                //else
                //    wartosc += pozycje[index].obliczWartosc();
            }
        }
        return wartosc;
    }

    public String toString()
    {
        String caleZamowienie = String.format("\nZamównienie:\n");
        for(int index = 0; index < pozycje.length; index++)
        {
            if(pozycje[index] != null) {
                //return String.format("%-20s %10.2f zł %4d szt. %10.2f zł (przed rabatem %10.2f zł)", this.nazwaTowaru, cena, ileSztuk, this.obliczWartoscZRabatem(), this.obliczWartosc());

                if(pozycje[index].czyJestRabat()) {
                    caleZamowienie += String.format("%-20s %10.2f zł %4d szt. %10.2f zł (przed rabatem %10.2f zł)\n", pozycje[index].nazwaTowaru, pozycje[index].cena, pozycje[index].ileSztuk, pozycje[index].obliczWartoscZRabatem(), pozycje[index].obliczWartosc());
                } else {
                    caleZamowienie += String.format("%-20s %10.2f zł %4d szt. %10.2f zł\n", pozycje[index].nazwaTowaru, pozycje[index].cena, pozycje[index].ileSztuk, pozycje[index].obliczWartosc());
                }
            }
        }

        caleZamowienie += String.format("\n");
        caleZamowienie += String.format("Razem: %.2f zł (przed rabatem %.2f zł)\n",obliczWartosc(true), obliczWartosc(false));
        caleZamowienie += String.format("\n");

        return caleZamowienie;
    }

    public static void zapiszZamowienie(Zamowienie z, String nazwaPliku)
    {
        FileOutputStream fileOut;
        try {
            fileOut = new FileOutputStream(nazwaPliku);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(z);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in " + nazwaPliku);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Zamowienie wczytajZamowienie(String nazwaPliku)
    {
        Zamowienie zam = null;

        try {
            FileInputStream fileIn = new FileInputStream(nazwaPliku);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            zam = (Zamowienie) in.readObject();
            System.out.println("Serialized data is read from " + nazwaPliku);
            in.close();
            fileIn.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return zam;
    }
}
