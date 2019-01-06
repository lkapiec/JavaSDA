package sdajava20181229.lenic.eu;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Lista {

    private int pojemnosc;
    private int rozmiar;
    private int liczby[];

    public Lista(int pojemnosc)
    {
        this.pojemnosc = pojemnosc;
        this.rozmiar = 0;
        liczby = new int[this.pojemnosc];
    }

    public Lista()
    {
         this(10);
    }

    /* zakladam ze nowa wartosc dodaje zawsze na koncu, troche mi to zrobi roboty podczas usuwania */
    public void dodajElement(int wartosc)
    {
        if(this.rozmiar >= this.pojemnosc) {
            System.out.println("Nie mozna dodać wiecej elemetów, lista pełna!");
        } else
        {
            liczby[this.rozmiar++] = wartosc;
        }
    } /* completed */

    public void pisz()
    {
        System.out.print("Lista:\n\tPojemność: " + this.pojemnosc +"\n\tRozmiar: " + this.rozmiar + "\n\tElementy: ");
        for(int index = 0; index < this.rozmiar; index++) {
                    System.out.print(liczby[index] + " ");
        }
        System.out.println("");
    } /* completed */

    public int znajdz(int wartosc)
    {
        int result = -1;
        for(int index = 0; index <= this.rozmiar; index++) {
                if (liczby[index] == wartosc) return index;
        }
        return result;
    } /* completed */

    public void usun(int pozycja)
    {
        /* zabiezpieczenie */
        if((pozycja < 0)||(pozycja > pojemnosc)) return;

        for(int index = pozycja; index < (pojemnosc-1); index++)
        {
            liczby[index] = liczby[index+1];
        }

        this.rozmiar--;
    } /* completed */

    public void usunPierwszy(int wartosc)
    {
        usun(znajdz(wartosc));
    } /* completed */

    public void usunPowtorzenia()
    {
        int pozycja = rozmiar;
        do {
            /* pobieramy wartosci do konca, ta wskazowka znajduje sie w przykladzie z zadania :) */
            int wartosc = liczby[--pozycja];
            /* szukamy (w ciemno) pozycji na ktorej ta wartosc jest ale od początku tabeli */
            int index = znajdz(wartosc);


            //fajne! informacje debugowania
            //System.out.println("");
            //for(int i = 0; i < this.rozmiar; i++) {
            //    if(index == i)
            //    System.out.print("("+liczby[i] + ") ");
            //    else
            //        System.out.print(liczby[i] + " ");
            //}
            //System.out.println("");
            //System.out.println("poz=" + pozycja + " wartosc=" + wartosc + " index=" + index);

            // zabiezpieczenie aby samo nie kasowalo pierwszych wystąpień
            if(pozycja != index) usun(index);

        } while(pozycja > 0);
    }

    public void zamien(int a, int b)
    {
        int iWartosc;

        iWartosc = liczby[a];
        liczby[a] = liczby[b];
        liczby[b] = iWartosc;
    }

    /* tym mozna spraewdzac palinromy */
    public void odwroc()
    {
        int max = (rozmiar % 2 == 0) ? rozmiar / 2: (rozmiar - 1) / 2;

        for(int index = 0; index < max; index++)
        {
            //System.out.println("P="+index + "do" + (rozmiar-index-1));
            zamien(index,(rozmiar-index-1));
        }
    }

    public void zapiszDoPliku(String nazwa) throws FileNotFoundException
    {
        PrintWriter zapis = new PrintWriter(nazwa);
        for(int index = 0; index < rozmiar; index++) {
                zapis.print(liczby[index] + " ");
        }
        zapis.close();
    }

}
