package homework;

public class PojazdPrzyklad {


    static public void main(String...args) {

        Pojazd pojazd1 = new Pojazd();
        pojazd1.setLiczbaKol(5);

        System.out.println("liczba kol = " + pojazd1.getLiczbaKol());

        Pojazd pojazd2 = new Pojazd();
        pojazd2.setLiczbaKol(5);
        System.out.println("liczba kol = " + pojazd2.getLiczbaKol());


        Pojazd pojazd3 = new Pojazd();
        //pojazd1.liczbaKol = 8;
        System.out.println("pojazd 3 liczba kol = " + pojazd3.getLiczbaKol());


        pojazd3.jedz();
    }

}
