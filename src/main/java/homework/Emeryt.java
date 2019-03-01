package homework;

public abstract class Emeryt {
    public static final int ILOSC_OCZU = 2;

    // metoda abstrakcjna
    public abstract String krzyczNaDzieci();

    // zwyklad metoda z implementacją
    public static void bniegnijDoSklepu(int odleglosc, int predkosc)
    {
        double czas = (double) odleglosc / predkosc;
        System.out.println("Biegne po kielbase bede za " + czas + " sekund");
    }
}
