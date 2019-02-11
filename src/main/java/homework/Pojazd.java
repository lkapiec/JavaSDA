package homework;

public class Pojazd {

    private int liczbaKol;
    private String kolor;
    private int predkosc;


//    public Pojazd(int liczbaKol) {
//        this.liczbaKol = liczbaKol;
//        this.kolor = "niebieski";
//    }

    public Pojazd() {
        this.liczbaKol = 33;
        this.kolor = "niebieski";
    }

    public Pojazd(String col) {
        //  this.liczbaKol = liczbaKol;
        this.kolor = col;
    }



    //public Pojazd(int liczba, String kolor, int predkosc) {
    //    this.liczbaKol = liczba;
    //    this.kolor = kolor;
    //    this.predkosc = predkosc;
    //}



    public static void jedz()
    {}

    /* getter  - nazwa pola z prefixem Get */
    public int getLiczbaKol() {
        return liczbaKol;
    }

    /* setter */
    public void setLiczbaKol(int liczbaKol) {
        this.liczbaKol = liczbaKol;
    }

    public String getKolor() {
        return kolor;
    }

    /* setter */
    public void setKolor(String col) {
        this.kolor = col;
    }


    public Pojazd(int liczba, String kolor, int...predkosc) {
        this.liczbaKol = liczba;
        this.kolor = kolor;
        if(predkosc.length == 0) {
            this.predkosc = 100;
        } else
        {
            this.predkosc = predkosc[0];
        }
    }

    public void wyswietlDane() {
        System.out.println("Pojazd ma " + this.liczbaKol + " kola, jest " + this.kolor + " i moze jechać" + this.predkosc + " km/h");
    }

}
