package sdajava20181230.lenic.eu;

//kod moze zawierac błedy, nie jestem pewien jak powinna być zrealizowana metoda pomnoz i sumuj
//jakie wartosci powinny zwracac (czy to mają byc np nowe obiekty)
//https://github.com/lkapiec/JavaSDA

// nie jasne wymagania :)

import static java.lang.Math.abs;

public class Czas {

    private int godziny;
    private int minuty;

    private void wyrownaj()
    {
        if(this.minuty > 59)
        {
            // jesli minut jest wiecej niz 60 przeliczamy to liczbe godzin i minut jako reszta z dzielenia
            this.godziny += (int) this.minuty / 60;
            this.minuty = this.minuty % 60;
        } else if(this.minuty < 0)
        {
            // jesli mamy ujemn wartosc to realizujemy pozyczkę z godzin
            // musiał bym sprawdzic czy mogę opuscić metode abs(wartosc bezwzgledna)
            this.godziny -= (int) abs(this.minuty / 60) + 1;
            this.minuty = 60 - abs(this.minuty % 60);
        }
    } /* wyglada na poprawną */

    public Czas(int godziny, int minuty)
    {
        this.minuty = minuty;
        this.godziny = godziny;
        this.wyrownaj();
    } /* ok */

    public Czas()
    {
        this(0,0);
    } /* ok */

    public Czas(String wyrazenie)
    {
        /* wstepnie inicjalizujemy, bezpiecznie */
        this.minuty = 0;
        this.godziny = 0;

        /* zabiezpieczenie przed głupotami */
        if(wyrazenie != null)
        if(!wyrazenie.equals(""))
        {
            // podziel wszysko wg spacji
            String []tablica = wyrazenie.split(" ");

            if(tablica[1].equals("h")&&tablica[3].equals("min"))
            {
                /* dodać ewentualną obsługe wyjątku */
                this.godziny = Integer.parseInt(tablica[0]);
                this.minuty = Integer.parseInt(tablica[2]);
                this.wyrownaj();
            } else
            {
                System.out.println("Nie prawidłowy typ danych (dopisz wiecej kodu aby pomoc uzytkownikowi)");
            }
        }
    }

    public String toString() {
        return "" + this.godziny + " h " + this.minuty + " min";
    } /* ok */

    public Czas dodaj(Czas t)
    {
        /* robimy kopie obiekty ktory zostal przeslany jako argmnent i juz na nim bedziemy operować */
        Czas newcomplex = new Czas(this.godziny, this.minuty);

        newcomplex.godziny += t.godziny;
        newcomplex.minuty += t.minuty;

        newcomplex.wyrownaj();

        return newcomplex;
    } /* ok */

    public Czas odejmij(Czas t)
    {
        Czas newcomplex = new Czas(this.godziny, this.minuty);

        newcomplex.godziny -= t.godziny;
        newcomplex.minuty -= t.minuty;

        newcomplex.wyrownaj();

        return newcomplex;
    } /* ok */

    public Czas pomnoz(int ile)
    {
        this.minuty *= ile;
        this.godziny *= ile;

        this.wyrownaj();

        return this;
    } /* ok */


    public static Czas sumuj(Czas [] tab, int n)
    {
        Czas t = new Czas();

        for(int index = 0; index < n; index++)
        {
            t.godziny += (int) tab[index].godziny;
            t.minuty += tab[index].minuty;
        }

        t.wyrownaj();

        return t;
    } /* ok */
}
