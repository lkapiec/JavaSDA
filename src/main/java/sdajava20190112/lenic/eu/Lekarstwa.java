package sdajava20190112.lenic.eu;

import java.util.List;
import java.util.Map;

public class Lekarstwa {

    private List<String> nazwa;
    private Map<String, Double> cena;
    private Map<String, Double> refundacja;

    public Lekarstwa( List<String> nazwa, Map<String, Double> cena, Map<String, Double> refundacja) {

        // pierwsza litera ma byc wieksza
        this.nazwa = nazwa;

        this.cena = cena;
        this.refundacja = refundacja;
    }

    public double cena(String lek, boolean ubezpieczony)
    {
        Double prePrice = null;

        // na podstawie nazwy pobieramy index na liscie
        int index = this.nazwa.indexOf(lek);

        if(index == -1)
        {
            // jak nie ma elementy
        } else
        {
            prePrice = this.cena.get(lek);

            if(prePrice == null)
            {
                // wyjątek
            }

            if(ubezpieczony) {
                Double refundacja = this.refundacja.get(lek);

                if(refundacja == null)
                {
                    // wyjątek
                }

                prePrice = prePrice - (prePrice * refundacja);
            }
        }
        return prePrice;
    }

    public String maksymalnaRefundacja()
    {
        Double cenaZRefundacja = 0.0;
        Double cena;
        String nazwaLeku = null;

        for(String nazwa : this.nazwa)
        {
            Double prePrice = this.cena.get(nazwa);
            Double refundacja = this.refundacja.get(nazwa);

            if((prePrice != null) && (refundacja != null))
            {
                cena = prePrice - (prePrice * refundacja / 100);
                //System.out.println("n:" + nazwa + "pp=" + prePrice + " ref=" + refundacja + " cena=" + cena);

                if(cena > cenaZRefundacja)
                {
                    cenaZRefundacja = cena;
                    nazwaLeku = nazwa;
                }
            }
        }

        return nazwaLeku;
    }

    public double kosztCalkowity()
    {
        double suma = 0;

        for(String nazwa : this.nazwa)
        {
            if(this.cena.get(nazwa) != null)
            {
                suma += this.cena.get(nazwa);
            }
        }
        return suma;
    }

    public void wyswietl()
    {
        for(String nazwa : this.nazwa)
        {
            System.out.println("Nazwa: " + nazwa + ", cena: "+ this.cena.get(nazwa) + " zł, refundacja: " + this.refundacja.get(nazwa) + " %");
        }
    }
}