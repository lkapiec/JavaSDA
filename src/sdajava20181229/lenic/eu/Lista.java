package sdajava20181229.lenic.eu;

public class Lista {

    private int pojemnosc;
    private int rozmiar;
    private int liczby[];
    private boolean liczbyBln[];

    public Lista(int pojemnosc)
    {
        this.pojemnosc = pojemnosc;
        this.rozmiar = 0;
        liczby = new int[this.pojemnosc];
        liczbyBln = new boolean[this.pojemnosc];
    }

    public Lista()
    {
         this(10);
    }

    public void dodajElement(int wartosc)
    {
        if(rozmiar >= pojemnosc) {
            System.out.println("Nie mozna dodać wiecej elemetów, lista pełna!");
        } else
        {
            //System.out.println("Dodaje na pozycji: " + rozmiar + " wartosc: " + wartosc);
            liczby[rozmiar] = wartosc;
            liczbyBln[rozmiar] = true;
            this.rozmiar++;
        }
    }

    public void pisz()
    {
        System.out.print("Lista:\n\tPojemność: " + this.pojemnosc +"\n\tRozmiar: " + rozmiar + "\n\tElementy: ");
        for(int index = 0; index < pojemnosc; index++) {

                if (liczbyBln[index]) {
                    System.out.print(liczby[index] + " ");
                }
        }
        System.out.println("");
    }

    public int znajdz(int wartosc)
    {
        int result = -1;
        for(int index = 0; index <= pojemnosc; index++) {
            if (liczbyBln[index]) {
                if (liczby[index] == wartosc) return index;
            }
        }
        return result;
    }

    public void usun(int pozycja)
    {
        liczbyBln[pozycja] = false;
        this.rozmiar--;



    } /* completed */

    public void usunPierwszy(int wartosc)
    {
        int zn = znajdz(wartosc);
        usun(zn);
    } /* completed */


    public void usunPowtorzenia()
    {
        //int ilosc = rozmiar;

        //while((rozmiar--) < 0) {
        //    usunPierwszy(wartosc);
        //};
    }

    public void odwroc()
    {

    }

    public void zapiszDoPliku(String nazwa)
    {

    }

}
