
package sdajava20181230.lenic.eu;


public class TestujCzas {


    public static void main(String...args) {

        Czas t1 = new Czas(10, 56);
        Czas t2 = new Czas(0, 123);


        System.out.println("t1 = " + t1);
        System.out.println("t2 = " + t2);

        System.out.println("t1 + t2 = " + t1.dodaj(t2));
        System.out.println("t1 - t2 = " + t1.odejmij(t2));



        Czas [] tab = {t1, t2, t2};
        System.out.println("Czas.sumuj dla t1 + t2 + t2 = " + Czas.sumuj(tab, tab.length));
        //System.out.println("t1 * 2 = " + t1.pomnoz(2));

        //Czas t3 = new Czas("3 h 17 min");
        //System.out.println("Konstruktor z łancuchem " + t3);


    }
}


