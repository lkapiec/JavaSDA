package sdajava20190112.lenic.eu;

import java.util.*;

public class TestLekarstwa {

    public static void main(String...arg)
    {
        List<String > nazwa = new ArrayList<String>();
        Map<String, Double> cena = new HashMap<String, Double>();
        Map<String, Double> refundacja = new HashMap<String, Double>();

        nazwa.add("GRIPEX");
        nazwa.add("APAP");
        nazwa.add("PAVULON");

        refundacja.put("APAP", 3.0);
        refundacja.put("GRIPEX",  5.8);

        cena.put("APAP", 15.9);
        cena.put("GRIPEX",  20.4);

        Lekarstwa lekarstwa = new Lekarstwa(nazwa, cena, refundacja);

        System.out.println("cena:" + lekarstwa.cena("APAP", true));
        System.out.println("koszt całkowoty:" + lekarstwa.kosztCalkowity());
        System.out.println("maksymalna refundacja:" + lekarstwa.maksymalnaRefundacja());

        lekarstwa.wyswietl();
    }
}
