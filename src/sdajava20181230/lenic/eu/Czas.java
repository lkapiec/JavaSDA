package sdajava20181230.lenic.eu;

public class Czas {

    private int godziny;
    private int minuty;

    public Czas(int godziny, int minuty)
    {
        /* skoro mamy jawne metody do odejmowania to nie potrzebujemy reagowac na wartosci ujemnie */
        if((minuty < 0)||(godziny < 0)) return;

        if(minuty >= 60)
        {
            this.godziny = (int) minuty / 60;
            this.minuty = minuty % 60;
        } else
        {
            this.minuty = minuty;
        }

        // godzin mozemy miec nawet 100 i to tam nie przeszkadza */
        this.godziny += godziny;
    }

    public Czas()
    {
        this(0,0);
    }

    public Czas(String wyrazenie)
    {
        if(wyrazenie.equals(""))
        {
            //this(0,0);
        }
    }

    public String toString() {
        return "" + godziny + " h " + minuty + " min";
    }


    public Czas dodaj(Czas t)
    {
        Czas newcomplex = new Czas(this.godziny, this.minuty);

        if(t.minuty >= 60)
        {
            newcomplex.godziny += (int) t.minuty / 60;
            newcomplex.minuty += t.minuty % 60;
        } else
        {
            newcomplex.minuty += t.minuty;
        }

        // godzin mozemy miec nawet 100 i to tam nie przeszkadza */
        newcomplex.godziny += t.godziny;

        return newcomplex;
    }

    public Czas odejmij(Czas t)
    {
        Czas newcomplex = new Czas(this.godziny, this.minuty);

        newcomplex.godziny -= t.godziny;

        int min = this.minuty - t.minuty;

        if(min < 0)
        {
            newcomplex.minuty += min;
            newcomplex.godziny -= 1;
        } else
        {
            newcomplex.minuty -= t.minuty;
        }


        return newcomplex;
    }

    public Czas pomnoz(int ile)
    {
        int minuty = (this.godziny) * 60 + this.minuty;
        minuty *= ile;

        this.minuty = minuty % 60;
        this.godziny = (int) minuty / 60;

        return this;
    }

    public static Czas sumuj(Czas [] tab, int n)
    {
        Czas t = new Czas();

        for(int index = 0; index < n; index++)
        {
            System.out.println(">" + tab[index].toString());

            if(tab[index].minuty >= 60)
            {
                t.godziny += (int) tab[index].minuty / 60;
                t.minuty += tab[index].minuty % 60;
            } else
            {
                t.minuty += tab[index].minuty;
            }

            // godzin mozemy miec nawet 100 i to tam nie przeszkadza */
            t.godziny += tab[index].godziny;
        }
        return t;
    }

}
